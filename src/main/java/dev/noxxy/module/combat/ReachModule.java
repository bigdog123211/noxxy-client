package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ReachModule extends Module {
    private final Setting<Float> reach = new Setting<>("Reach", "Attack reach distance", 5.5f);
    private final Setting<Boolean> blockReach = new Setting<>("Block Reach", "Extend block reach", true);
    
    public ReachModule() {
        super("Reach", "Increases attack and reach distance", "Combat");
        settings.add(reach);
        settings.add(blockReach);
    }
    
    @Override
    public void onEnable() {
        // Enable extended reach
    }
    
    @Override
    public void onDisable() {
        // Reset reach
    }
}