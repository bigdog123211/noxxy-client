package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class BPSCounterModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Text scale", 1.0f);
    
    public BPSCounterModule() {
        super("BPS Counter", "Shows block placements per second", "HUD");
        settings.add(scale);
    }
    
    @Override
    public void onEnable() {
        // Show BPS counter
    }
    
    @Override
    public void onDisable() {
        // Hide BPS counter
    }
}