package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class HighJumpModule extends Module {
    private final Setting<Float> height = new Setting<>("Height", "Jump height", 3.0f);
    
    public HighJumpModule() {
        super("High Jump", "Jump higher", "Movement");
        settings.add(height);
    }
    
    @Override
    public void onEnable() {
        // Enable high jump
    }
    
    @Override
    public void onDisable() {
        // Disable high jump
    }
}