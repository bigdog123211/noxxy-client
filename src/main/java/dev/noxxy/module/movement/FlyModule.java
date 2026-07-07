package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class FlyModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Fly speed", 1.0f);
    private final Setting<String> mode = new Setting<>("Mode", "Fly mode", "Vanilla");
    
    public FlyModule() {
        super("Fly", "Allows flying", "Movement");
        settings.add(speed);
        settings.add(mode);
    }
    
    @Override
    public void onEnable() {
        // Enable flying
    }
    
    @Override
    public void onDisable() {
        // Disable flying
    }
}