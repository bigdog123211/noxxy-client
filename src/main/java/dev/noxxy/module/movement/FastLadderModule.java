package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class FastLadderModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Ladder climb speed", 2.0f);
    
    public FastLadderModule() {
        super("Fast Ladder", "Climb ladders faster", "Movement");
        settings.add(speed);
    }
    
    @Override
    public void onEnable() {
        // Enable fast ladder
    }
    
    @Override
    public void onDisable() {
        // Disable fast ladder
    }
}