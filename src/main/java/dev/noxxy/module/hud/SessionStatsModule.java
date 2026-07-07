package dev.noxxy.module.hud;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class SessionStatsModule extends Module {
    private final Setting<Float> scale = new Setting<>("Scale", "Text scale", 1.0f);
    private final Setting<Boolean> kills = new Setting<>("Kills", "Show kill count", true);
    private final Setting<Boolean> deaths = new Setting<>("Deaths", "Show death count", true);
    
    public SessionStatsModule() {
        super("Session Stats", "Shows session statistics", "HUD");
        settings.add(scale);
        settings.add(kills);
        settings.add(deaths);
    }
    
    @Override
    public void onEnable() {
        // Show stats
    }
    
    @Override
    public void onDisable() {
        // Hide stats
    }
}