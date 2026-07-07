package dev.noxxy.module.world;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class TimerModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Game speed multiplier", 1.0f);
    
    public TimerModule() {
        super("Timer", "Changes game speed", "World");
        settings.add(speed);
    }
    
    @Override
    public void onEnable() {
        // Enable timer
    }
    
    @Override
    public void onDisable() {
        // Disable timer
    }
}