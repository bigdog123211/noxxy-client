package dev.noxxy.module.misc;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class WaypointsModule extends Module {
    private final Setting<Boolean> render = new Setting<>("Render", "Render waypoints", true);
    private final Setting<Integer> distance = new Setting<>("Distance", "Waypoint display distance", 100);
    
    public WaypointsModule() {
        super("Waypoints", "Save and view waypoints", "Misc");
        settings.add(render);
        settings.add(distance);
    }
    
    @Override
    public void onEnable() {
        // Enable waypoints
    }
    
    @Override
    public void onDisable() {
        // Disable waypoints
    }
}