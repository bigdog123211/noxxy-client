package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ItemESPModule extends Module {
    private final Setting<Float> distance = new Setting<>("Distance", "Item ESP distance", 30.0f);
    private final Setting<Boolean> text = new Setting<>("Text", "Show item text", true);
    
    public ItemESPModule() {
        super("Item ESP", "Highlights dropped items", "Render");
        settings.add(distance);
        settings.add(text);
    }
    
    @Override
    public void onEnable() {
        // Enable item ESP
    }
    
    @Override
    public void onDisable() {
        // Disable item ESP
    }
}