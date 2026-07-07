package dev.noxxy.ui;

public class Button extends Widget {
    private Runnable onClick;
    
    public Button(int x, int y, int width, int height, String label, Runnable onClick) {
        super(x, y, width, height, label);
        this.onClick = onClick;
    }
    
    @Override
    public void render(int mouseX, int mouseY) {
        hovered = isMouseOver(mouseX, mouseY);
        
        // Draw button background
        int color = hovered ? 0xFF3498DB : 0xFF2C3E50;
        drawRect(x, y, x + width, y + height, color);
        
        // Draw button border
        drawBorder(x, y, x + width, y + height, 0xFF34495E);
        
        // Draw text
        drawString(label, x + width / 2, y + height / 2, 0xFFFFFFFF);
    }
    
    @Override
    public void mouseClicked(int mouseX, int mouseY, int button) {
        if (isMouseOver(mouseX, mouseY) && button == 0) {
            onClick.run();
        }
    }
    
    @Override
    public void mouseReleased(int mouseX, int mouseY, int button) {
    }
    
    private void drawRect(int x1, int y1, int x2, int y2, int color) {
        // Implementation
    }
    
    private void drawBorder(int x1, int y1, int x2, int y2, int color) {
        // Implementation
    }
    
    private void drawString(String text, int x, int y, int color) {
        // Implementation
    }
}
