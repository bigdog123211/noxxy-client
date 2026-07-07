package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AutoArmorModule extends Module {
    private final Setting<Boolean> damage = new Setting<>("Take Damage", "Switch armor when taking damage", true);
    private final Setting<Boolean> autoRepair = new Setting<>("Auto Repair", "Auto repair in anvil", false);
    
    public AutoArmorModule() {
        super("Auto Armor", "Automatically equips best armor", "Player");
        settings.add(damage);
        settings.add(autoRepair);
    }
    
    @Override
    public void onEnable() {
        // Enable auto armor
    }
    
    @Override
    public void onDisable() {
        // Disable auto armor
    }
}