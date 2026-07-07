package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class CriticalsModule extends Module {
    private final Setting<Boolean> packet = new Setting<>("Packet", "Use packet method", false);
    private final Setting<Float> height = new Setting<>("Height", "Jump height for crits", 0.5f);
    
    public CriticalsModule() {
        super("Criticals", "Always land critical hits", "Combat");
        settings.add(packet);
        settings.add(height);
    }
    
    @Override
    public void onEnable() {
        // Enable criticals
    }
    
    @Override
    public void onDisable() {
        // Disable criticals
    }
}