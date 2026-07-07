package dev.noxxy.util;

import java.awt.Color;

public class RenderUtil {
    public static void drawRect(int x, int y, int width, int height, int color) {
        drawFilledQuad(x, y, x + width, y, x + width, y + height, x, y + height, color);
    }
    
    public static void drawBorder(int x, int y, int width, int height, int color, float thickness) {
        // Top
        drawRect(x, y, width, (int) thickness, color);
        // Bottom
        drawRect(x, y + height - (int) thickness, width, (int) thickness, color);
        // Left
        drawRect(x, y, (int) thickness, height, color);
        // Right
        drawRect(x + width - (int) thickness, y, (int) thickness, height, color);
    }
    
    public static void drawCircle(int x, int y, int radius, int color) {
        int r = (color >> 16) & 255;
        int g = (color >> 8) & 255;
        int b = color & 255;
        int a = (color >> 24) & 255;
        
        for (int i = 0; i < 360; i += 5) {
            double angle = Math.toRadians(i);
            int px = (int) (x + radius * Math.cos(angle));
            int py = (int) (y + radius * Math.sin(angle));
            
            drawRect(px, py, 1, 1, color);
        }
    }
    
    public static void drawLine(int x1, int y1, int x2, int y2, int color, float width) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        
        if (distance == 0) return;
        
        double ratio = width / 2 / distance;
        double px = -dy * ratio;
        double py = dx * ratio;
        
        drawFilledQuad(
            (int) (x1 + px), (int) (y1 + py),
            (int) (x2 + px), (int) (y2 + py),
            (int) (x2 - px), (int) (y2 - py),
            (int) (x1 - px), (int) (y1 - py),
            color
        );
    }
    
    public static void drawString(String text, int x, int y, int color) {
        // Render text using Minecraft font renderer
    }
    
    public static void drawGradient(int x, int y, int width, int height, int color1, int color2) {
        // Draw gradient rectangle
    }
    
    private static void drawFilledQuad(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int color) {
        // Implementation using tessellator
    }
}
