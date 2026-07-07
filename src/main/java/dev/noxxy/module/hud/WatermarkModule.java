package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class WatermarkModule extends Module {
    private final Setting<String> text = new Setting<>("Text", "Watermark text", "Noxxy Client");
    private final Setting<Float> scale = new Setting<>("Scale", "Text scale", 1.0f);
    
    public WatermarkModule() {
        super("Watermark", "Shows client watermark", "HUD");
        settings.add(text);
        settings.add(scale);
    }
    
    @Override
    public void onEnable() {
        // Show watermark
    }
    
    @Override
    public void onDisable() {
        // Hide watermark
    }
}