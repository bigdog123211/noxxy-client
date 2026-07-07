package dev.noxxy.module.misc;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class ChatSpammerModule extends Module {
    private final Setting<String> message = new Setting<>("Message", "Message to spam", "Hello!");
    private final Setting<Integer> delay = new Setting<>("Delay", "Message delay ms", 1000);
    
    public ChatSpammerModule() {
        super("Chat Spammer", "Automatically spams chat", "Misc");
        settings.add(message);
        settings.add(delay);
    }
    
    @Override
    public void onEnable() {
        // Enable chat spammer
    }
    
    @Override
    public void onDisable() {
        // Disable chat spammer
    }
}