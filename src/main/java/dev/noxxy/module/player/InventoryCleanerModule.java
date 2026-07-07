package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class InventoryCleanerModule extends Module {
    private final Setting<Boolean> dropTrash = new Setting<>("Drop Trash", "Drop unwanted items", true);
    private final Setting<Boolean> sortHotbar = new Setting<>("Sort Hotbar", "Sort hotbar items", false);
    
    public InventoryCleanerModule() {
        super("Inventory Cleaner", "Organizes inventory", "Player");
        settings.add(dropTrash);
        settings.add(sortHotbar);
    }
    
    @Override
    public void onEnable() {
        // Enable inventory cleaner
    }
    
    @Override
    public void onDisable() {
        // Disable inventory cleaner
    }
}