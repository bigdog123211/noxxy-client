package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ArmorHUDModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Armor scale", 1.0f);
    private final Setting<Boolean> durability = new Setting<>("Durability", "Show durability", true);
    
    public ArmorHUDModule() {
        super("Armor HUD", "Shows armor status", "HUD");
        settings.add(scale);
        settings.add(durability);
    }
    
    @Override
    public void onEnable() {
        // Show armor HUD
    }
    
    @Override
    public void onDisable() {
        // Hide armor HUD
    }
}