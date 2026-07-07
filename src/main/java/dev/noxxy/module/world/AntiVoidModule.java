package dev.noxxy.module.world;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AntiVoidModule extends Module {
    private final Setting<Float> distance = new Setting<>("Distance", "Void distance threshold", 100.0f);
    private final Setting<String> mode = new Setting<>("Mode", "Anti void mode", "Teleport");
    
    public AntiVoidModule() {
        super("Anti Void", "Prevents falling into void", "World");
        settings.add(distance);
        settings.add(mode);
    }
    
    @Override
    public void onEnable() {
        // Enable anti void
    }
    
    @Override
    public void onDisable() {
        // Disable anti void
    }
}