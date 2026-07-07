package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class BacktrackModule extends Module {
    private final Setting<Integer> ticks = new Setting<>("Ticks", "Backtrack ticks", 10);
    private final Setting<Boolean> visual = new Setting<>("Visual", "Show backtrack visually", true);
    
    public BacktrackModule() {
        super("Backtrack", "Backtracks player positions", "Combat");
        settings.add(ticks);
        settings.add(visual);
    }
    
    @Override
    public void onEnable() {
        // Enable backtrack
    }
    
    @Override
    public void onDisable() {
        // Disable backtrack
    }
}