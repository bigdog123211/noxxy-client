package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AutoFishModule extends Module {
    private final Setting<Integer> delay = new Setting<>("Delay", "Click delay ms", 100);
    private final Setting<Boolean> autoReel = new Setting<>("Auto Reel", "Auto reel fish", true);
    
    public AutoFishModule() {
        super("Auto Fish", "Automatically fishes", "Player");
        settings.add(delay);
        settings.add(autoReel);
    }
    
    @Override
    public void onEnable() {
        // Enable auto fish
    }
    
    @Override
    public void onDisable() {
        // Disable auto fish
    }
}