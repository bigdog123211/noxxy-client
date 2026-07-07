package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class HitBoxesModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Hitbox size scale", 1.5f);
    private final Setting<Boolean> extend = new Setting<>("Extend", "Extend hitboxes", true);
    
    public HitBoxesModule() {
        super("HitBoxes", "Expands player hitboxes", "Combat");
        settings.add(scale);
        settings.add(extend);
    }
    
    @Override
    public void onEnable() {
        // Enable hitbox expansion
    }
    
    @Override
    public void onDisable() {
        // Reset hitboxes
    }
}