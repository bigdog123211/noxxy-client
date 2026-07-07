package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ShieldBreakerModule extends Module {
    private final Setting<Boolean> breakShield = new Setting<>("Break Shield", "Break enemy shields", true);
    private final Setting<Integer> cps = new Setting<>("CPS", "Axe swing CPS", 5);
    
    public ShieldBreakerModule() {
        super("Shield Breaker", "Breaks shields with axes", "Combat");
        settings.add(breakShield);
        settings.add(cps);
    }
    
    @Override
    public void onEnable() {
        // Enable shield breaker
    }
    
    @Override
    public void onDisable() {
        // Disable shield breaker
    }
}