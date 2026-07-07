package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

import java.util.ArrayList;
import java.util.List;

public class ArrayListModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Text scale", 1.0f);
    private final Setting<String> alignment = new Setting<>("Alignment", "ArrayList alignment", "Right");
    private final Setting<Boolean> outline = new Setting<>("Outline", "Draw outline", true);
    
    public ArrayListModule() {
        super("Array List", "Shows enabled modules", "HUD");
        settings.add(scale);
        settings.add(alignment);
        settings.add(outline);
    }
    
    @Override
    public void onEnable() {
        // Show module list
    }
    
    @Override
    public void onDisable() {
        // Hide module list
    }
}