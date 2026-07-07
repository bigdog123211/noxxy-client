package dev.noxxy.ui;

public class Toggle extends Widget {
    private boolean enabled = false;
    private Runnable onChange;
    
    public Toggle(int x, int y, int width, int height, String label, boolean defaultValue, Runnable onChange) {
        super(x, y, width, height, label);
        this.enabled = defaultValue;
        this.onChange = onChange;
    }
    
    @Override
    public void render(int mouseX, int mouseY) {
        hovered = isMouseOver(mouseX, mouseY);
        
        // Draw toggle background
        int bgColor = enabled ? 0xFF27AE60 : 0xFF95A5A6;
        drawRect(x, y, x + width, y + height, bgColor);
        
        // Draw toggle circle
        int circleX = enabled ? x + width - 10 : x + 5;
        drawCircle(circleX, y + height / 2, 5, 0xFFFFFFFF);
        
        // Draw label
        drawString(label, x + width + 10, y + height / 2, 0xFFFFFFFF);
    }
    
    @Override
    public void mouseClicked(int mouseX, int mouseY, int button) {
        if (isMouseOver(mouseX, mouseY) && button == 0) {
            enabled = !enabled;
            onChange.run();
        }
    }
    
    @Override
    public void mouseReleased(int mouseX, int mouseY, int button) {
    }
    
    public boolean isEnabled() { return enabled; }
    
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
