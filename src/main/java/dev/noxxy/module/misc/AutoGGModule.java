package dev.noxxy.module.misc;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AutoGGModule extends Module {
    private final Setting<Boolean> delay = new Setting<>("Delay", "Delay message sending", true);
    private final Setting<String> message = new Setting<>("Message", "Custom GG message", "gg");
    
    public AutoGGModule() {
        super("Auto GG", "Automatically says gg after game", "Misc");
        settings.add(delay);
        settings.add(message);
    }
    
    @Override
    public void onEnable() {
        // Enable auto GG
    }
    
    @Override
    public void onDisable() {
        // Disable auto GG
    }
}