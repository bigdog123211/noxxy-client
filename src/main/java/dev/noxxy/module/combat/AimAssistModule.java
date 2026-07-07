package dev.noxxy.module.combat;

import dev.noxxy.module.Module;
import dev.noxxy.setting.Setting;

public class AimAssistModule extends Module {
    private final Setting<Float> smoothness = new Setting<>("Smoothness", "Aim smoothness", 0.5f);
    private final Setting<Float> fov = new Setting<>("FOV", "Field of view", 45.0f);
    private final Setting<Boolean> predict = new Setting<>("Predict", "Predict player movement", true);
    
    public AimAssistModule() {
        super("Aim Assist", "Assists aiming at targets", "Combat");
        settings.add(smoothness);
        settings.add(fov);
        settings.add(predict);
    }
    
    @Override
    public void onEnable() {
        // Enable aim assist
    }
    
    @Override
    public void onDisable() {
        // Disable aim assist
    }
}