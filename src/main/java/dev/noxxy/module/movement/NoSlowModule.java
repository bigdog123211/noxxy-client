package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class NoSlowModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Speed reduction factor", 1.0f);
    
    public NoSlowModule() {
        super("No Slow", "No slowdown from items", "Movement");
        settings.add(speed);
    }
    
    @Override
    public void onEnable() {
        // Disable slowdown
    }
    
    @Override
    public void onDisable() {
        // Re-enable slowdown
    }
}