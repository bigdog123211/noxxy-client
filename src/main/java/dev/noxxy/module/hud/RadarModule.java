package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class RadarModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Radar scale", 1.0f);
    private final Setting<Integer> size = new Setting<>("Size", "Radar size pixels", 100);
    private final Setting<Boolean> players = new Setting<>("Players", "Show players", true);
    
    public RadarModule() {
        super("Radar", "Shows a radar of nearby entities", "HUD");
        settings.add(scale);
        settings.add(size);
        settings.add(players);
    }
    
    @Override
    public void onEnable() {
        // Show radar
    }
    
    @Override
    public void onDisable() {
        // Hide radar
    }
}