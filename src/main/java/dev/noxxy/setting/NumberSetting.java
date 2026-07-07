package dev.noxxy.setting;

public class NumberSetting<T extends Number> extends Setting<T> {
    private final T minValue;
    private final T maxValue;
    
    public NumberSetting(String name, String description, T defaultValue, T minValue, T maxValue) {
        super(name, description, defaultValue);
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    
    public T getMinValue() { return minValue; }
    public T getMaxValue() { return maxValue; }
    
    @Override
    public void setValue(T value) {
        if (value instanceof Integer) {
            int v = (Integer) value;
            int min = (Integer) minValue;
            int max = (Integer) maxValue;
            this.value = (T) Integer.valueOf(Math.max(min, Math.min(max, v)));
        } else if (value instanceof Float) {
            float v = (Float) value;
            float min = (Float) minValue;
            float max = (Float) maxValue;
            this.value = (T) Float.valueOf(Math.max(min, Math.min(max, v)));
        } else if (value instanceof Double) {
            double v = (Double) value;
            double min = (Double) minValue;
            double max = (Double) maxValue;
            this.value = (T) Double.valueOf(Math.max(min, Math.min(max, v)));
        } else {
            this.value = value;
        }
    }
}
