package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class LongJumpModule extends Module {
    private final Setting<Float> distance = new Setting<>("Distance", "Jump distance", 5.0f);
    private final Setting<String> mode = new Setting<>("Mode", "Jump mode", "Boost");
    
    public LongJumpModule() {
        super("Long Jump", "Jump great distances", "Movement");
        settings.add(distance);
        settings.add(mode);
    }
    
    @Override
    public void onEnable() {
        // Enable long jump
    }
    
    @Override
    public void onDisable() {
        // Disable long jump
    }
}