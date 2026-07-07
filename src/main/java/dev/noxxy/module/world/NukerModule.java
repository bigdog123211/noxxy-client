package dev.noxxy.module.world;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class NukerModule extends Module {
    private final Setting<Float> range = new Setting<>("Range", "Block break range", 5.0f);
    private final Setting<String> mode = new Setting<>("Mode", "Nuker mode", "Flat");
    private final Setting<Boolean> instant = new Setting<>("Instant", "Instant break", false);
    
    public NukerModule() {
        super("Nuker", "Breaks all blocks around you", "World");
        settings.add(range);
        settings.add(mode);
        settings.add(instant);
    }
    
    @Override
    public void onEnable() {
        // Enable nuker
    }
    
    @Override
    public void onDisable() {
        // Disable nuker
    }
}