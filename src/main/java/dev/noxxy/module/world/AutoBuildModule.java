package dev.noxxy.module.world;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AutoBuildModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Build speed", 1.0f);
    private final Setting<String> mode = new Setting<>("Mode", "Build mode", "Normal");
    
    public AutoBuildModule() {
        super("Auto Build", "Automatically builds structures", "World");
        settings.add(speed);
        settings.add(mode);
    }
    
    @Override
    public void onEnable() {
        // Enable auto build
    }
    
    @Override
    public void onDisable() {
        // Disable auto build
    }
}