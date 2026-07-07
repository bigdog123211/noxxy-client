package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AntiAFKModule extends Module {
    private final Setting<Integer> interval = new Setting<>("Interval", "Movement interval ms", 5000);
    private final Setting<String> mode = new Setting<>("Mode", "Anti AFK mode", "Rotate");
    
    public AntiAFKModule() {
        super("Anti AFK", "Prevents AFK kick", "Player");
        settings.add(interval);
        settings.add(mode);
    }
    
    @Override
    public void onEnable() {
        // Enable anti AFK
    }
    
    @Override
    public void onDisable() {
        // Disable anti AFK
    }
}