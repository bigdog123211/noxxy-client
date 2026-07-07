package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class PingDisplayModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Text scale", 1.0f);
    
    public PingDisplayModule() {
        super("Ping Display", "Shows current ping", "HUD");
        settings.add(scale);
    }
    
    @Override
    public void onEnable() {
        // Show ping
    }
    
    @Override
    public void onDisable() {
        // Hide ping
    }
}