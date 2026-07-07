package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class TargetHUDModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "HUD scale", 1.0f);
    private final Setting<Boolean> health = new Setting<>("Health", "Show health bar", true);
    private final Setting<Boolean> armor = new Setting<>("Armor", "Show armor", true);
    
    public TargetHUDModule() {
        super("Target HUD", "Shows target information", "HUD");
        settings.add(scale);
        settings.add(health);
        settings.add(armor);
    }
    
    @Override
    public void onEnable() {
        // Show target HUD
    }
    
    @Override
    public void onDisable() {
        // Hide target HUD
    }
}