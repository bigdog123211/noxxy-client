package dev.noxxy.setting;

import java.util.ArrayList;
import java.util.List;

public class ModeSetting extends Setting<String> {
    private final List<String> modes;
    
    public ModeSetting(String name, String description, String defaultMode, String... modes) {
        super(name, description, defaultMode);
        this.modes = new ArrayList<>();
        for (String mode : modes) {
            this.modes.add(mode);
        }
    }
    
    public List<String> getModes() {
        return new ArrayList<>(modes);
    }
    
    public void cycle() {
        int currentIndex = modes.indexOf(value);
        if (currentIndex == -1) {
            value = modes.get(0);
        } else {
            value = modes.get((currentIndex + 1) % modes.size());
        }
    }
    
    @Override
    public void setValue(String value) {
        if (modes.contains(value)) {
            this.value = value;
        }
    }
}
