package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class CrosshairEditorModule extends Module {
    private final Setting<String> style = new Setting<>("Style", "Crosshair style", "Plus");
    private final Setting<Float> scale = new Setting<>("Scale", "Crosshair scale", 1.0f);
    
    public CrosshairEditorModule() {
        super("Crosshair Editor", "Customize crosshair", "HUD");
        settings.add(style);
        settings.add(scale);
    }
    
    @Override
    public void onEnable() {
        // Show crosshair editor
    }
    
    @Override
    public void onDisable() {
        // Hide crosshair editor
    }
}