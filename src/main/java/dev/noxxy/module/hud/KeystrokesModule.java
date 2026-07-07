package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class KeystrokesModule extends Module {
    private final Setting<Boolean> mouse = new Setting<>("Mouse", "Show mouse buttons", true);
    private final Setting<Float> scale = new Setting<>("Scale", "Keystroke scale", 1.0f);
    
    public KeystrokesModule() {
        super("Keystrokes", "Shows key presses on screen", "HUD");
        settings.add(mouse);
        settings.add(scale);
    }
    
    @Override
    public void onEnable() {
        // Show keystrokes
    }
    
    @Override
    public void onDisable() {
        // Hide keystrokes
    }
}