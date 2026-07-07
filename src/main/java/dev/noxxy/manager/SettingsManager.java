package dev.noxxy.manager;

import java.util.*;

public class SettingsManager {
    private final Map<String, Object> settings = new HashMap<>();
    
    public void setSetting(String key, Object value) {
        settings.put(key, value);
    }
    
    public Object getSetting(String key) {
        return settings.get(key);
    }
    
    public boolean getBoolean(String key) {
        Object value = settings.get(key);
        return value instanceof Boolean ? (Boolean) value : false;
    }
    
    public int getInt(String key) {
        Object value = settings.get(key);
        return value instanceof Number ? ((Number) value).intValue() : 0;
    }
    
    public float getFloat(String key) {
        Object value = settings.get(key);
        return value instanceof Number ? ((Number) value).floatValue() : 0f;
    }
    
    public double getDouble(String key) {
        Object value = settings.get(key);
        return value instanceof Number ? ((Number) value).doubleValue() : 0d;
    }
    
    public String getString(String key) {
        Object value = settings.get(key);
        return value instanceof String ? (String) value : "";
    }
}
