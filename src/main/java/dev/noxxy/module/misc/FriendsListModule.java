package dev.noxxy.module.misc;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class FriendsListModule extends Module {
    private final Setting<Boolean> notify = new Setting<>("Notify", "Notify on friend join", true);
    
    public FriendsListModule() {
        super("Friends List", "Manages friends list", "Misc");
        settings.add(notify);
    }
    
    @Override
    public void onEnable() {
        // Enable friends list
    }
    
    @Override
    public void onDisable() {
        // Disable friends list
    }
}