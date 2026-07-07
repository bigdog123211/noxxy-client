package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AutoToolModule extends Module {
    private final Setting<Boolean> breakBlocks = new Setting<>("Break Blocks", "Switch for mining", true);
    private final Setting<Boolean> swordSwitch = new Setting<>("Sword Switch", "Switch for combat", true);
    
    public AutoToolModule() {
        super("Auto Tool", "Automatically selects best tool", "Player");
        settings.add(breakBlocks);
        settings.add(swordSwitch);
    }
    
    @Override
    public void onEnable() {
        // Enable auto tool
    }
    
    @Override
    public void onDisable() {
        // Disable auto tool
    }
}