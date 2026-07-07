package dev.noxxy.event;

public class Hud2DRenderEvent extends RenderEvent {
    private final int screenWidth;
    private final int screenHeight;
    
    public Hud2DRenderEvent(float partialTicks, int screenWidth, int screenHeight) {
        super(partialTicks);
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }
    
    public int getScreenWidth() { return screenWidth; }
    public int getScreenHeight() { return screenHeight; }
}
