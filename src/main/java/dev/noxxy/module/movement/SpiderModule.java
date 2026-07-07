package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class SpiderModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Climb speed", 0.5f);
    
    public SpiderModule() {
        super("Spider", "Climb walls like spider", "Movement");
        settings.add(speed);
    }
    
    @Override
    public void onEnable() {
        // Enable spider climbing
    }
    
    @Override
    public void onDisable() {
        // Disable spider climbing
    }
}