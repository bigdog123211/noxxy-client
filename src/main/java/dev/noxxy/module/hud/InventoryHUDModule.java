package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class InventoryHUDModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "HUD scale", 1.0f);
    private final Setting<Boolean> itemCount = new Setting<>("Item Count", "Show item counts", true);
    
    public InventoryHUDModule() {
        super("Inventory HUD", "Shows inventory items", "HUD");
        settings.add(scale);
        settings.add(itemCount);
    }
    
    @Override
    public void onEnable() {
        // Show inventory HUD
    }
    
    @Override
    public void onDisable() {
        // Hide inventory HUD
    }
}