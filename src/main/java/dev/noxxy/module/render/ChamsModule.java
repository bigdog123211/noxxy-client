package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ChamsModule extends Module {
    private final Setting<String> mode = new Setting<>("Mode", "Chams mode", "Solid");
    private final Setting<Float> opacity = new Setting<>("Opacity", "Opacity", 0.8f);
    
    public ChamsModule() {
        super("Chams", "Renders entities through walls", "Render");
        settings.add(mode);
        settings.add(opacity);
    }
    
    @Override
    public void onEnable() {
        // Enable chams
    }
    
    @Override
    public void onDisable() {
        // Disable chams
    }
}