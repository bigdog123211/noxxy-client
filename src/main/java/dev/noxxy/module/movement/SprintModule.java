package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class SprintModule extends Module {
    private final Setting<Boolean> foodCheck = new Setting<>("Food Check", "Check hunger before sprint", false);
    
    public SprintModule() {
        super("Sprint", "Always sprint", "Movement");
        settings.add(foodCheck);
    }
    
    @Override
    public void onEnable() {
        // Enable auto sprint
    }
    
    @Override
    public void onDisable() {
        // Disable auto sprint
    }
}