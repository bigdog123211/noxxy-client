package dev.noxxy.module.misc;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AnnouncerModule extends Module {
    private final Setting<String> message = new Setting<>("Message", "Announcement message", "Check out my client!");
    private final Setting<Integer> interval = new Setting<>("Interval", "Announce interval", 60000);
    
    public AnnouncerModule() {
        super("Announcer", "Announces messages periodically", "Misc");
        settings.add(message);
        settings.add(interval);
    }
    
    @Override
    public void onEnable() {
        // Enable announcer
    }
    
    @Override
    public void onDisable() {
        // Disable announcer
    }
}