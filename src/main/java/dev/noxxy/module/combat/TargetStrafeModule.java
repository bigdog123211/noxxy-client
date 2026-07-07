package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class TargetStrafeModule extends Module {
    private final Setting<Float> radius = new Setting<>("Radius", "Strafe radius", 2.0f);
    private final Setting<Float> speed = new Setting<>("Speed", "Strafe speed", 1.0f);
    private final Setting<Boolean> towards = new Setting<>("Towards", "Strafe towards player", false);
    
    public TargetStrafeModule() {
        super("Target Strafe", "Strafes around target", "Combat");
        settings.add(radius);
        settings.add(speed);
        settings.add(towards);
    }
    
    @Override
    public void onEnable() {
        // Enable strafing
    }
    
    @Override
    public void onDisable() {
        // Stop strafing
    }
}