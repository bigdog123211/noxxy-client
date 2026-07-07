package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AutoClickerModule extends Module {
    private final Setting<Integer> cps = new Setting<>("CPS", "Clicks per second", 10);
    private final Setting<Integer> variation = new Setting<>("Variation", "CPS variation", 2);
    private final Setting<Boolean> randomDelay = new Setting<>("Random Delay", "Randomize delays", true);
    
    public AutoClickerModule() {
        super("Auto Clicker", "Automatically clicks at set CPS", "Combat");
        settings.add(cps);
        settings.add(variation);
        settings.add(randomDelay);
    }
    
    @Override
    public void onEnable() {
        // Start clicking
    }
    
    @Override
    public void onDisable() {
        // Stop clicking
    }
}