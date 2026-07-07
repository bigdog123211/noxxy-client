package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class NoFallModule extends Module {
    private final Setting<String> mode = new Setting<>("Mode", "No fall mode", "Packet");
    private final Setting<Float> distance = new Setting<>("Distance", "Fall distance", 3.0f);
    
    public NoFallModule() {
        super("No Fall", "Prevents fall damage", "Player");
        settings.add(mode);
        settings.add(distance);
    }
    
    @Override
    public void onEnable() {
        // Enable no fall
    }
    
    @Override
    public void onDisable() {
        // Disable no fall
    }
}