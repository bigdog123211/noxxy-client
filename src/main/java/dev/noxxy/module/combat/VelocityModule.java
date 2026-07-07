package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class VelocityModule extends Module {
    private final Setting<Float> horizontal = new Setting<>("Horizontal", "Horizontal velocity reduce", 0.1f);
    private final Setting<Float> vertical = new Setting<>("Vertical", "Vertical velocity reduce", 0.1f);
    
    public VelocityModule() {
        super("Velocity", "Reduces knockback velocity", "Combat");
        settings.add(horizontal);
        settings.add(vertical);
    }
    
    @Override
    public void onEnable() {
        // Enable velocity reduce
    }
    
    @Override
    public void onDisable() {
        // Disable velocity reduce
    }
}