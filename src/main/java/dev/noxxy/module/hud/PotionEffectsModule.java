package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class PotionEffectsModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Icon scale", 1.0f);
    private final Setting<Boolean> timer = new Setting<>("Timer", "Show effect duration", true);
    
    public PotionEffectsModule() {
        super("Potion Effects", "Shows active potion effects", "HUD");
        settings.add(scale);
        settings.add(timer);
    }
    
    @Override
    public void onEnable() {
        // Show potion effects
    }
    
    @Override
    public void onDisable() {
        // Hide potion effects
    }
}