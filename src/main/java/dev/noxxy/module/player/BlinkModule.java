package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class BlinkModule extends Module {
    private final Setting<Integer> delay = new Setting<>("Delay", "Blink duration ms", 1000);
    private final Setting<Boolean> packet = new Setting<>("Packet", "Packet blink", true);
    
    public BlinkModule() {
        super("Blink", "Hides position from others", "Player");
        settings.add(delay);
        settings.add(packet);
    }
    
    @Override
    public void onEnable() {
        // Enable blinking
    }
    
    @Override
    public void onDisable() {
        // Disable blinking
    }
}