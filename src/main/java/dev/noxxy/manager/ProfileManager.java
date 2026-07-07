package dev.noxxy.manager;

import dev.noxxy.NoxxyClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ProfileManager {
    private final NoxxyClient client;
    private final Path profilesDir;
    private final Gson gson;
    
    public ProfileManager(NoxxyClient client) {
        this.client = client;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        this.profilesDir = Paths.get(System.getProperty("user.home"), ".noxxy", "profiles");
        
        try {
            Files.createDirectories(profilesDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void saveProfile(String name) {
        Map<String, Object> profile = new HashMap<>();
        
        for (Module module : client.getModuleManager().getModules()) {
            Map<String, Object> moduleData = new HashMap<>();
            moduleData.put("enabled", module.isEnabled());
            moduleData.put("keybind", module.getKeybind());
            profile.put(module.getName(), moduleData);
        }
        
        try {
            Path profilePath = profilesDir.resolve(name + ".json");
            Files.write(profilePath, gson.toJson(profile).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void loadProfile(String name) {
        try {
            Path profilePath = profilesDir.resolve(name + ".json");
            if (!Files.exists(profilePath)) return;
            
            String content = new String(Files.readAllBytes(profilePath));
            // Parse and restore profile
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public List<String> getProfiles() {
        List<String> profiles = new ArrayList<>();
        try {
            Files.list(profilesDir)
                .filter(p -> p.toString().endsWith(".json"))
                .forEach(p -> profiles.add(p.getFileName().toString().replace(".json", "")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return profiles;
    }
}
