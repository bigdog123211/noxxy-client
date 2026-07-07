package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ChestStealerModule extends Module {
    private final Setting<Integer> delay = new Setting<>("Delay", "Item steal delay ms", 10);
    private final Setting<Boolean> closeChest = new Setting<>("Close Chest", "Close when empty", true);
    
    public ChestStealerModule() {
        super("Chest Stealer", "Automatically steals from chests", "Player");
        settings.add(delay);
        settings.add(closeChest);
    }
    
    @Override
    public void onEnable() {
        // Enable chest stealer
    }
    
    @Override
    public void onDisable() {
        // Disable chest stealer
    }
}