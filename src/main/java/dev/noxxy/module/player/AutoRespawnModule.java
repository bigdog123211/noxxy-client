package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AutoRespawnModule extends Module {
    private final Setting<Integer> delay = new Setting<>("Delay", "Respawn delay ms", 0);
    private final Setting<Boolean> instant = new Setting<>("Instant", "Instant respawn", true);
    
    public AutoRespawnModule() {
        super("Auto Respawn", "Automatically respawns", "Player");
        settings.add(delay);
        settings.add(instant);
    }
    
    @Override
    public void onEnable() {
        // Enable auto respawn
    }
    
    @Override
    public void onDisable() {
        // Disable auto respawn
    }
}