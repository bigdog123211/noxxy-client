package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class JesusModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Water walk speed", 1.5f);
    private final Setting<String> mode = new Setting<>("Mode", "Water walk mode", "Strafe");
    
    public JesusModule() {
        super("Jesus", "Walk on water", "Movement");
        settings.add(speed);
        settings.add(mode);
    }
    
    @Override
    public void onEnable() {
        // Enable water walking
    }
    
    @Override
    public void onDisable() {
        // Disable water walking
    }
}