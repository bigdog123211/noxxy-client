package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class FastBreakModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Block break speed multiplier", 2.0f);
    private final Setting<Boolean> instant = new Setting<>("Instant", "Instant break", false);
    
    public FastBreakModule() {
        super("Fast Break", "Break blocks faster", "Player");
        settings.add(speed);
        settings.add(instant);
    }
    
    @Override
    public void onEnable() {
        // Enable fast break
    }
    
    @Override
    public void onDisable() {
        // Disable fast break
    }
}