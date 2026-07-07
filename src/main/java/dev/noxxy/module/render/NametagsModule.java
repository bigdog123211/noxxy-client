package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class NametagsModule extends Module {
    private final Setting<Boolean> distance = new Setting<>("Distance", "Show player distance", true);
    private final Setting<Boolean> health = new Setting<>("Health", "Show health bars", true);
    
    public NametagsModule() {
        super("Nametags", "Enhanced player nametags", "Render");
        settings.add(distance);
        settings.add(health);
    }
    
    @Override
    public void onEnable() {
        // Enable nametags
    }
    
    @Override
    public void onDisable() {
        // Disable nametags
    }
}