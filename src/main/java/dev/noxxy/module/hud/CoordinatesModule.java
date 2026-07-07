package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class CoordinatesModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Text scale", 1.0f);
    private final Setting<Boolean> cardinal = new Setting<>("Cardinal", "Show cardinal directions", true);
    
    public CoordinatesModule() {
        super("Coordinates", "Shows your position", "HUD");
        settings.add(scale);
        settings.add(cardinal);
    }
    
    @Override
    public void onEnable() {
        // Show coordinates
    }
    
    @Override
    public void onDisable() {
        // Hide coordinates
    }
}