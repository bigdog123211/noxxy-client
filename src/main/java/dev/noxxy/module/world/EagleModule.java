package dev.noxxy.module.world;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class EagleModule extends Module {
    private final Setting<Boolean> sneak = new Setting<>("Sneak", "Sneak when not looking", true);
    
    public EagleModule() {
        super("Eagle", "Auto sneaks at block edges", "World");
        settings.add(sneak);
    }
    
    @Override
    public void onEnable() {
        // Enable eagle
    }
    
    @Override
    public void onDisable() {
        // Disable eagle
    }
}