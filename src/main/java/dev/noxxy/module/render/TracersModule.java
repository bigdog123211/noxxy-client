package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class TracersModule extends Module {
    private final Setting<Float> width = new Setting<>("Width", "Tracer line width", 2.0f);
    private final Setting<Boolean> players = new Setting<>("Players", "Trace players", true);
    
    public TracersModule() {
        super("Tracers", "Draw lines to entities", "Render");
        settings.add(width);
        settings.add(players);
    }
    
    @Override
    public void onEnable() {
        // Enable tracers
    }
    
    @Override
    public void onDisable() {
        // Disable tracers
    }
}