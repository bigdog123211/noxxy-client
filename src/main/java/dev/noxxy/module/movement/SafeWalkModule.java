package dev.noxxy.module.movement;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class SafeWalkModule extends Module {
    private final Setting<Boolean> sneakEdges = new Setting<>("Sneak Edges", "Sneak at edges", true);
    
    public SafeWalkModule() {
        super("Safe Walk", "Prevents fall damage", "Movement");
        settings.add(sneakEdges);
    }
    
    @Override
    public void onEnable() {
        // Enable safe walk
    }
    
    @Override
    public void onDisable() {
        // Disable safe walk
    }
}