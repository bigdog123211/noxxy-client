package dev.noxxy.ui;

import java.util.ArrayList;
import java.util.List;

public class Window {
    private String title;
    private int x, y, width, height;
    private boolean dragging = false;
    private int dragX, dragY;
    private List<Widget> widgets = new ArrayList<>();
    private boolean visible = true;
    private boolean minimized = false;
    
    public Window(String title, int x, int y, int width, int height) {
        this.title = title;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public void addWidget(Widget widget) {
        widgets.add(widget);
    }
    
    public void render(int mouseX, int mouseY) {
        if (!visible) return;
        
        // Draw window background
        drawBackground();
        
        // Draw title bar
        drawTitleBar(mouseX, mouseY);
        
        if (!minimized) {
            // Render all widgets
            for (Widget widget : widgets) {
                widget.render(mouseX, mouseY);
            }
        }
    }
    
    public void mouseClicked(int mouseX, int mouseY, int button) {
        if (!visible) return;
        
        // Check if clicking title bar for dragging
        if (mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + 20) {
            dragging = true;
            dragX = mouseX - x;
            dragY = mouseY - y;
        }
        
        if (!minimized) {
            for (Widget widget : widgets) {
                widget.mouseClicked(mouseX, mouseY, button);
            }
        }
    }
    
    public void mouseDragged(int mouseX, int mouseY) {
        if (dragging) {
            x = mouseX - dragX;
            y = mouseY - dragY;
        }
    }
    
    public void mouseReleased(int mouseX, int mouseY, int button) {
        dragging = false;
        
        if (!minimized) {
            for (Widget widget : widgets) {
                widget.mouseReleased(mouseX, mouseY, button);
            }
        }
    }
    
    private void drawBackground() {
        // Draw semi-transparent background
    }
    
    private void drawTitleBar(int mouseX, int mouseY) {
        // Draw title bar with title text
    }
    
    public void setVisible(boolean visible) { this.visible = visible; }
    public boolean isVisible() { return visible; }
    public void setMinimized(boolean minimized) { this.minimized = minimized; }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}
