package dev.noxxy.module.misc;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AutoQueueModule extends Module {
    private final Setting<Integer> delay = new Setting<>("Delay", "Queue delay ms", 500);
    private final Setting<Boolean> autoRequeue = new Setting<>("Auto Requeue", "Auto rejoin queue", true);
    
    public AutoQueueModule() {
        super("Auto Queue", "Automatically queues for games", "Misc");
        settings.add(delay);
        settings.add(autoRequeue);
    }
    
    @Override
    public void onEnable() {
        // Enable auto queue
    }
    
    @Override
    public void onDisable() {
        // Disable auto queue
    }
}