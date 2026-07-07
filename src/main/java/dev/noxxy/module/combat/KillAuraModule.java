package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class KillAuraModule extends Module {
    private final Setting<Float> range = new Setting<>("Range", "Attack range", 5.0f);
    private final Setting<Integer> cps = new Setting<>("CPS", "Clicks per second", 15);
    private final Setting<Boolean> rotate = new Setting<>("Rotate", "Rotate to target", true);
    private final Setting<Boolean> swing = new Setting<>("Swing", "Swing animation", true);
    
    public KillAuraModule() {
        super("Kill Aura", "Automatically attacks nearby entities", "Combat");
        settings.add(range);
        settings.add(cps);
        settings.add(rotate);
        settings.add(swing);
    }
    
    @Override
    public void onEnable() {
        // Implementation for kill aura
    }
    
    @Override
    public void onDisable() {
        // Stop attacking
    }
}