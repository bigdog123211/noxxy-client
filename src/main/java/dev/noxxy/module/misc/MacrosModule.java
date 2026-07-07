package dev.noxxy.module.misc;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class MacrosModule extends Module {
    private final Setting<Boolean> enabled = new Setting<>("Enabled", "Enable macros", true);
    
    public MacrosModule() {
        super("Macros", "Create and run macros", "Misc");
        settings.add(enabled);
    }
    
    @Override
    public void onEnable() {
        // Enable macros
    }
    
    @Override
    public void onDisable() {
        // Disable macros
    }
}