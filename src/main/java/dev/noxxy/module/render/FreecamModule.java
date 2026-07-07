package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class FreecamModule extends Module {
    private final Setting<Float> speed = new Setting<>("Speed", "Freecam speed", 1.0f);
    private final Setting<Boolean> noClip = new Setting<>("NoClip", "Pass through blocks", true);
    
    public FreecamModule() {
        super("Freecam", "Move camera freely", "Render");
        settings.add(speed);
        settings.add(noClip);
    }
    
    @Override
    public void onEnable() {
        // Enable freecam
    }
    
    @Override
    public void onDisable() {
        // Disable freecam
    }
}