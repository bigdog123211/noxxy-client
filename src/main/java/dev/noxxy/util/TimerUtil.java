package dev.noxxy.util;

import net.minecraft.client.MinecraftClient;

public class TimerUtil {
    private long lastTime;
    private long delay;
    
    public TimerUtil(long delay) {
        this.delay = delay;
        this.lastTime = System.currentTimeMillis();
    }
    
    public boolean hasReached() {
        return System.currentTimeMillis() - lastTime >= delay;
    }
    
    public void reset() {
        lastTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return System.currentTimeMillis() - lastTime;
    }
    
    public void setDelay(long delay) {
        this.delay = delay;
    }
    
    public long getDelay() {
        return delay;
    }
}
