package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class PhaseModule extends Module {
    private final Setting<String> mode = new Setting<>("Mode", "Phase mode", "Clipping");
    private final Setting<Float> speed = new Setting<>("Speed", "Phase speed", 1.0f);
    
    public PhaseModule() {
        super("Phase", "Phase through blocks", "Movement");
        settings.add(mode);
        settings.add(speed);
    }
    
    @Override
    public void onEnable() {
        // Enable phasing
    }
    
    @Override
    public void onDisable() {
        // Disable phasing
    }
}