package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class InventoryMoveModule extends Module {
    private final Setting<Boolean> inContainer = new Setting<>("In Container", "Move in containers", true);
    
    public InventoryMoveModule() {
        super("Inventory Move", "Move while in inventory", "Movement");
        settings.add(inContainer);
    }
    
    @Override
    public void onEnable() {
        // Enable inventory movement
    }
    
    @Override
    public void onDisable() {
        // Disable inventory movement
    }
}