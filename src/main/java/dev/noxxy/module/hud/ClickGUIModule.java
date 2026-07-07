package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ClickGUIModule extends Module {
    private final Setting<String> theme = new Setting<>("Theme", "GUI theme", "Dark");
    private final Setting<Float> scale = new Setting<>("Scale", "GUI scale", 1.0f);
    private final Setting<Boolean> blur = new Setting<>("Blur", "Background blur effect", true);
    
    public ClickGUIModule() {
        super("Click GUI", "Opens the click GUI", "HUD");
        settings.add(theme);
        settings.add(scale);
        settings.add(blur);
    }
    
    @Override
    public void onEnable() {
        // Show GUI
    }
    
    @Override
    public void onDisable() {
        // Hide GUI
    }
}