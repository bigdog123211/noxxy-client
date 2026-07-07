package dev.noxxy.module;

import dev.noxxy.manager.EventHandler;
import dev.noxxy.setting.Setting;

import java.util.*;

public abstract class Module {
    private final String name;
    private final String description;
    private final String category;
    private boolean enabled = false;
    private int keybind = -1;
    private boolean favorite = false;
    
    protected List<Setting<?>> settings = new ArrayList<>();
    
    public Module(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }
    
    public abstract void onEnable();
    public abstract void onDisable();
    
    public void toggle() {
        if (enabled) {
            disable();
        } else {
            enable();
        }
    }
    
    public void enable() {
        this.enabled = true;
        onEnable();
    }
    
    public void disable() {
        this.enabled = false;
        onDisable();
    }
    
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public int getKeybind() { return keybind; }
    public void setKeybind(int key) { this.keybind = key; }
    public boolean isFavorite() { return favorite; }
    public void setFavorite(boolean favorite) { this.favorite = favorite; }
    public List<Setting<?>> getSettings() { return settings; }
}
