package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class TriggerBotModule extends Module {
    private final Setting<Integer> delay = new Setting<>("Delay", "Click delay in ms", 0);
    private final Setting<Boolean> attackPlayers = new Setting<>("Players", "Attack players", true);
    private final Setting<Boolean> attackMobs = new Setting<>("Mobs", "Attack mobs", false);
    
    public TriggerBotModule() {
        super("Trigger Bot", "Automatically clicks when in crosshair", "Combat");
        settings.add(delay);
        settings.add(attackPlayers);
        settings.add(attackMobs);
    }
    
    @Override
    public void onEnable() {
        // Trigger bot activation
    }
    
    @Override
    public void onDisable() {
        // Stop trigger bot
    }
}