package dev.noxxy.module.misc;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class DiscordRPCModule extends Module {
    private final Setting<Boolean> enabled = new Setting<>("Enabled", "Enable Discord RPC", true);
    private final Setting<String> details = new Setting<>("Details", "RPC details", "Playing Minecraft");
    
    public DiscordRPCModule() {
        super("Discord RPC", "Shows Discord Rich Presence", "Misc");
        settings.add(enabled);
        settings.add(details);
    }
    
    @Override
    public void onEnable() {
        // Enable Discord RPC
    }
    
    @Override
    public void onDisable() {
        // Disable Discord RPC
    }
}