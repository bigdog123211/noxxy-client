package dev.noxxy.module.world;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class FastMineModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Mine speed multiplier", 2.0f);
    
    public FastMineModule() {
        super("Fast Mine", "Break blocks faster", "World");
        settings.add(speed);
    }
    
    @Override
    public void onEnable() {
        // Enable fast mine
    }
    
    @Override
    public void onDisable() {
        // Disable fast mine
    }
}