package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class BlockOverlayModule extends Module {
    private final Setting<Float> width = new Setting<>("Width", "Outline width", 2.0f);
    private final Setting<Boolean> fill = new Setting<>("Fill", "Fill blocks", false);
    
    public BlockOverlayModule() {
        super("Block Overlay", "Highlights blocks", "Render");
        settings.add(width);
        settings.add(fill);
    }
    
    @Override
    public void onEnable() {
        // Enable block overlay
    }
    
    @Override
    public void onDisable() {
        // Disable block overlay
    }
}