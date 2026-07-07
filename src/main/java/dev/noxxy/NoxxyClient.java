package dev.noxxy;

import dev.noxxy.manager.ModuleManager;
import dev.noxxy.manager.EventBus;
import dev.noxxy.manager.SettingsManager;
import dev.noxxy.manager.ProfileManager;

public class NoxxyClient {
    private static NoxxyClient instance;
    
    private final ModuleManager moduleManager;
    private final EventBus eventBus;
    private final SettingsManager settingsManager;
    private final ProfileManager profileManager;
    
    private NoxxyClient() {
        this.eventBus = new EventBus();
        this.moduleManager = new ModuleManager(this);
        this.settingsManager = new SettingsManager();
        this.profileManager = new ProfileManager(this);
        
        moduleManager.registerAllModules();
    }
    
    public static NoxxyClient getInstance() {
        if (instance == null) {
            instance = new NoxxyClient();
        }
        return instance;
    }
    
    public ModuleManager getModuleManager() {
        return moduleManager;
    }
    
    public EventBus getEventBus() {
        return eventBus;
    }
    
    public SettingsManager getSettingsManager() {
        return settingsManager;
    }
    
    public ProfileManager getProfileManager() {
        return profileManager;
    }
}
