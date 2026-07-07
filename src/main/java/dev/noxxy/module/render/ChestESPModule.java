package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ChestESPModule extends Module {
    private final Setting<Float> distance = new Setting<>("Distance", "Chest ESP distance", 50.0f);
    private final Setting<Boolean> shulker = new Setting<>("Shulkers", "Show shulker boxes", true);
    
    public ChestESPModule() {
        super("Chest ESP", "Highlights chests", "Render");
        settings.add(distance);
        settings.add(shulker);
    }
    
    @Override
    public void onEnable() {
        // Enable chest ESP
    }
    
    @Override
    public void onDisable() {
        // Disable chest ESP
    }
}