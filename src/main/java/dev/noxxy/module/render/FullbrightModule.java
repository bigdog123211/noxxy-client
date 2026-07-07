package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class FullbrightModule extends Module {
    private final Setting<Float> brightness = new Setting<>("Brightness", "Brightness level", 1.0f);
    private final Setting<String> mode = new Setting<>("Mode", "Fullbright mode", "Gamma");
    
    public FullbrightModule() {
        super("Fullbright", "Increases brightness in darkness", "Render");
        settings.add(brightness);
        settings.add(mode);
    }
    
    @Override
    public void onEnable() {
        // Enable fullbright
    }
    
    @Override
    public void onDisable() {
        // Disable fullbright
    }
}