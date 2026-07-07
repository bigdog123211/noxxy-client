package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class FPSCounterModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Text scale", 1.0f);
    private final Setting<Boolean> detailed = new Setting<>("Detailed", "Show detailed info", false);
    
    public FPSCounterModule() {
        super("FPS Counter", "Displays FPS on screen", "HUD");
        settings.add(scale);
        settings.add(detailed);
    }
    
    @Override
    public void onEnable() {
        // Show FPS counter
    }
    
    @Override
    public void onDisable() {
        // Hide FPS counter
    }
}