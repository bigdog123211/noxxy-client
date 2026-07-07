package dev.noxxy.ui;

public abstract class Widget {
    protected int x, y, width, height;
    protected String label;
    protected boolean hovered = false;
    
    public Widget(int x, int y, int width, int height, String label) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.label = label;
    }
    
    public abstract void render(int mouseX, int mouseY);
    public abstract void mouseClicked(int mouseX, int mouseY, int button);
    public abstract void mouseReleased(int mouseX, int mouseY, int button);
    
    protected boolean isMouseOver(int mouseX, int mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }
}
