package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class SpeedModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Movement speed multiplier", 1.5f);
    private final Setting<String> mode = new Setting<>("Mode", "Speed mode", "Strafe");
    
    public SpeedModule() {
        super("Speed", "Increases movement speed", "Movement");
        settings.add(speed);
        settings.add(mode);
    }
    
    @Override
    public void onEnable() {
        // Enable speed
    }
    
    @Override
    public void onDisable() {
        // Disable speed
    }
}