package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class NoHurtCamModule extends Module {
    private final Setting<Boolean> damage = new Setting<>("Damage", "Remove damage effect", true);
    
    public NoHurtCamModule() {
        super("No Hurt Cam", "Removes hurt camera effect", "Render");
        settings.add(damage);
    }
    
    @Override
    public void onEnable() {
        // Enable no hurt cam
    }
    
    @Override
    public void onDisable() {
        // Disable no hurt cam
    }
}