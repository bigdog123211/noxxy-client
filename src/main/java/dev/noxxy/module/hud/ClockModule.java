package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ClockModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Text scale", 1.0f);
    private final Setting<String> format = new Setting<>("Format", "Time format", "HH:mm:ss");
    
    public ClockModule() {
        super("Clock", "Shows current time", "HUD");
        settings.add(scale);
        settings.add(format);
    }
    
    @Override
    public void onEnable() {
        // Show clock
    }
    
    @Override
    public void onDisable() {
        // Hide clock
    }
}