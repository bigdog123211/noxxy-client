package dev.noxxy.module.world;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AutoMineModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Auto mine speed", 1.0f);
    private final Setting<Boolean> hold = new Setting<>("Hold", "Hold click", true);
    
    public AutoMineModule() {
        super("Auto Mine", "Automatically mines blocks", "World");
        settings.add(speed);
        settings.add(hold);
    }
    
    @Override
    public void onEnable() {
        // Enable auto mine
    }
    
    @Override
    public void onDisable() {
        // Disable auto mine
    }
}