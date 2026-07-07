package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class FastPlaceModule extends Module {
    private final Setting<Integer> delay = new Setting<>("Delay", "Block place delay", 0);
    private final Setting<Boolean> packet = new Setting<>("Packet", "Use packet placing", false);
    
    public FastPlaceModule() {
        super("Fast Place", "Place blocks faster", "Player");
        settings.add(delay);
        settings.add(packet);
    }
    
    @Override
    public void onEnable() {
        // Enable fast place
    }
    
    @Override
    public void onDisable() {
        // Disable fast place
    }
}