package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class DirectionModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Text scale", 1.0f);
    
    public DirectionModule() {
        super("Direction", "Shows facing direction", "HUD");
        settings.add(scale);
    }
    
    @Override
    public void onEnable() {
        // Show direction
    }
    
    @Override
    public void onDisable() {
        // Hide direction
    }
}