package dev.noxxy.module.world;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ScaffoldModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Scaffold speed", 1.0f);
    private final Setting<Boolean> downwards = new Setting<>("Downwards", "Scaffold downwards", true);
    private final Setting<String> mode = new Setting<>("Mode", "Scaffold mode", "Normal");
    
    public ScaffoldModule() {
        super("Scaffold", "Automatically places blocks beneath you", "World");
        settings.add(speed);
        settings.add(downwards);
        settings.add(mode);
    }
    
    @Override
    public void onEnable() {
        // Enable scaffolding
    }
    
    @Override
    public void onDisable() {
        // Disable scaffolding
    }
}