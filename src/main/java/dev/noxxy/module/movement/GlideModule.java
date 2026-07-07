package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class GlideModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Fall speed", 0.3f);
    
    public GlideModule() {
        super("Glide", "Glide while falling", "Movement");
        settings.add(speed);
    }
    
    @Override
    public void onEnable() {
        // Enable gliding
    }
    
    @Override
    public void onDisable() {
        // Disable gliding
    }
}