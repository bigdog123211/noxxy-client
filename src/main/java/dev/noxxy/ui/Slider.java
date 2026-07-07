package dev.noxxy.ui;

public class Slider extends Widget {
    private float value;
    private float minValue;
    private float maxValue;
    private Runnable onChange;
    private boolean dragging = false;
    
    public Slider(int x, int y, int width, int height, String label, float minValue, float maxValue, float defaultValue, Runnable onChange) {
        super(x, y, width, height, label);
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.value = defaultValue;
        this.onChange = onChange;
    }
    
    @Override
    public void render(int mouseX, int mouseY) {
        hovered = isMouseOver(mouseX, mouseY);
        
        // Draw slider background
        drawRect(x, y + height / 2 - 2, x + width, y + height / 2 + 2, 0xFF34495E);
        
        // Draw slider progress
        float progress = (value - minValue) / (maxValue - minValue);
        int progressWidth = (int) (width * progress);
        drawRect(x, y + height / 2 - 2, x + progressWidth, y + height / 2 + 2, 0xFF3498DB);
        
        // Draw slider handle
        int handleX = (int) (x + progressWidth);
        drawCircle(handleX, y + height / 2, 5, 0xFFFFFFFF);
        
        // Draw label and value
        drawString(label + ": " + String.format("%.2f", value), x, y - 10, 0xFFFFFFFF);
    }
    
    @Override
    public void mouseClicked(int mouseX, int mouseY, int button) {
        if (isMouseOver(mouseX, mouseY) && button == 0) {
            dragging = true;
            updateValue(mouseX);
        }
    }
    
    @Override
    public void mouseReleased(int mouseX, int mouseY, int button) {
        dragging = false;
    }
    
    public void mouseDragged(int mouseX, int mouseY) {
        if (dragging) {
            updateValue(mouseX);
        }
    }
    
    private void updateValue(int mouseX) {
        float percent = (float) (mouseX - x) / width;
        percent = Math.max(0, Math.min(1, percent));
        value = minValue + (maxValue - minValue) * percent;
        onChange.run();
    }
    
    public float getValue() { return value; }
    
    private void drawRect(int x1, int y1, int x2, int y2, int color) {
        // Implementation
    }
    
    private void drawCircle(int x, int y, int radius, int color) {
        // Implementation
    }
    
    private void drawString(String text, int x, int y, int color) {
        // Implementation
    }
}
