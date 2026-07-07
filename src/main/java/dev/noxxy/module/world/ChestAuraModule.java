package dev.noxxy.module.world;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ChestAuraModule extends Module {
    private final Setting<Float> range = new Setting<>("Range", "Chest aura range", 5.0f);
    private final Setting<Integer> cps = new Setting<>("CPS", "Click speed", 8);
    
    public ChestAuraModule() {
        super("Chest Aura", "Automatically opens nearby chests", "World");
        settings.add(range);
        settings.add(cps);
    }
    
    @Override
    public void onEnable() {
        // Enable chest aura
    }
    
    @Override
    public void onDisable() {
        // Disable chest aura
    }
}