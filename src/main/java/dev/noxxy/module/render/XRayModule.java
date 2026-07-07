package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class XRayModule extends Module {
    private final Setting<Boolean> ores = new Setting<>("Ores", "Show ores", true);
    private final Setting<Boolean> chests = new Setting<>("Chests", "Show chests", true);
    
    public XRayModule() {
        super("X-Ray", "See through blocks", "Render");
        settings.add(ores);
        settings.add(chests);
    }
    
    @Override
    public void onEnable() {
        // Enable X-Ray
    }
    
    @Override
    public void onDisable() {
        // Disable X-Ray
    }
}