package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ESPModule extends Module {
    private final Setting<Boolean> players = new Setting<>("Players", "Show player ESP", true);
    private final Setting<Boolean> mobs = new Setting<>("Mobs", "Show mob ESP", false);
    private final Setting<String> mode = new Setting<>("Mode", "ESP mode", "Box");
    
    public ESPModule() {
        super("ESP", "Shows entity positions through walls", "Render");
        settings.add(players);
        settings.add(mobs);
        settings.add(mode);
    }
    
    @Override
    public void onEnable() {
        // Enable ESP
    }
    
    @Override
    public void onDisable() {
        // Disable ESP
    }
}