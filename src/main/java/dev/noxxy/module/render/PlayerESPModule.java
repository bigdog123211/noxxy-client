package dev.noxxy.module.render;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class PlayerESPModule extends Module {
    private final Setting<String> mode = new Setting<>("Mode", "ESP mode", "Box");
    private final Setting<Boolean> teamColor = new Setting<>("Team Color", "Team color support", true);
    
    public PlayerESPModule() {
        super("Player ESP", "Highlights players", "Render");
        settings.add(mode);
        settings.add(teamColor);
    }
    
    @Override
    public void onEnable() {
        // Enable player ESP
    }
    
    @Override
    public void onDisable() {
        // Disable player ESP
    }
}