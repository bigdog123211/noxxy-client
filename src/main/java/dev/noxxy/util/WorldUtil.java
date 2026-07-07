package dev.noxxy.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;

public class WorldUtil {
    private static final MinecraftClient mc = MinecraftClient.getInstance();
    
    public static boolean isInWorld() {
        return mc.world != null && mc.player != null;
    }
    
    public static ClientWorld getWorld() {
        return mc.world;
    }
    
    public static long getWorldTime() {
        if (mc.world == null) return 0;
        return mc.world.getTime();
    }
    
    public static int getWorldDifficulty() {
        if (mc.world == null) return 0;
        return mc.world.getDifficulty().getId();
    }
    
    public static boolean isRaining() {
        if (mc.world == null) return false;
        return mc.world.isRaining();
    }
}
