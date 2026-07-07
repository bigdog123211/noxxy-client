package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class StepModule extends Module {
    private final Setting<Float> height = new Setting<>("Height", "Step height blocks", 2.0f);
    
    public StepModule() {
        super("Step", "Step up blocks automatically", "Movement");
        settings.add(height);
    }
    
    @Override
    public void onEnable() {
        // Enable stepping
    }
    
    @Override
    public void onDisable() {
        // Disable stepping
    }
}