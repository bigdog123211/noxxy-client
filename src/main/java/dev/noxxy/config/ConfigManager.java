package dev.noxxy.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dev.noxxy.NoxxyClient;
import dev.noxxy.module.Module;

import java.io.*;
import java.nio.file.*;
import java.util.Map;

public class ConfigManager {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final Path configDir = Paths.get(System.getProperty("user.home"), ".noxxy", "config");
    
    public ConfigManager() {
        try {
            Files.createDirectories(configDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void saveConfig() {
        JsonObject configJson = new JsonObject();
        
        // Save all modules and their settings
        NoxxyClient client = NoxxyClient.getInstance();
        for (Module module : client.getModuleManager().getModules()) {
            JsonObject moduleJson = new JsonObject();
            moduleJson.addProperty("enabled", module.isEnabled());
            moduleJson.addProperty("keybind", module.getKeybind());
            
            // Save module settings
            JsonObject settings = new JsonObject();
            for (dev.noxxy.setting.Setting<?> setting : module.getSettings()) {
                settings.addProperty(setting.getName(), setting.getValue().toString());
            }
            moduleJson.add("settings", settings);
            
            configJson.add(module.getName(), moduleJson);
        }
        
        try {
            Path configPath = configDir.resolve("config.json");
            Files.write(configPath, gson.toJson(configJson).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void loadConfig() {
        try {
            Path configPath = configDir.resolve("config.json");
            if (!Files.exists(configPath)) return;
            
            String content = new String(Files.readAllBytes(configPath));
            JsonObject configJson = gson.fromJson(content, JsonObject.class);
            
            // Load modules and their settings
            NoxxyClient client = NoxxyClient.getInstance();
            for (Module module : client.getModuleManager().getModules()) {
                if (configJson.has(module.getName())) {
                    JsonObject moduleJson = configJson.getAsJsonObject(module.getName());
                    
                    if (moduleJson.has("enabled")) {
                        module.setEnabled(moduleJson.get("enabled").getAsBoolean());
                    }
                    
                    if (moduleJson.has("keybind")) {
                        module.setKeybind(moduleJson.get("keybind").getAsInt());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
