package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AutoBlockModule extends Module {
    private final Setting<Integer> delay = new Setting<>("Delay", "Block delay in ms", 0);
    private final Setting<Boolean> packet = new Setting<>("Packet", "Use packet blocking", false);
    
    public AutoBlockModule() {
        super("Auto Block", "Automatically blocks with shield", "Combat");
        settings.add(delay);
        settings.add(packet);
    }
    
    @Override
    public void onEnable() {
        // Enable auto block
    }
    
    @Override
    public void onDisable() {
        // Disable auto block
    }
}