package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class CPSCounterModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Text scale", 1.0f);
    private final Setting<Boolean> leftClick = new Setting<>("Left Click", "Show left CPS", true);
    private final Setting<Boolean> rightClick = new Setting<>("Right Click", "Show right CPS", true);
    
    public CPSCounterModule() {
        super("CPS Counter", "Displays clicks per second", "HUD");
        settings.add(scale);
        settings.add(leftClick);
        settings.add(rightClick);
    }
    
    @Override
    public void onEnable() {
        // Show CPS counter
    }
    
    @Override
    public void onDisable() {
        // Hide CPS counter
    }
}