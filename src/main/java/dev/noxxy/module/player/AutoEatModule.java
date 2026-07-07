package dev.noxxy.module.player;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AutoEatModule extends Module {
    private final Setting<Integer> health = new Setting<>("Health", "Health threshold to eat", 10);
    private final Setting<Boolean> closestFood = new Setting<>("Closest Food", "Eat closest food", true);
    
    public AutoEatModule() {
        super("Auto Eat", "Automatically eats food", "Player");
        settings.add(health);
        settings.add(closestFood);
    }
    
    @Override
    public void onEnable() {
        // Enable auto eat
    }
    
    @Override
    public void onDisable() {
        // Disable auto eat
    }
}