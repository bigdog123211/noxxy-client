package dev.noxxy.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;

public class RotationUtil {
    private static final MinecraftClient mc = MinecraftClient.getInstance();
    
    public static float[] getRotation(double x, double y, double z) {
        double dx = x - mc.player.getX();
        double dy = y - (mc.player.getY() + mc.player.getEyeHeight(mc.player.getPose()));
        double dz = z - mc.player.getZ();
        
        double distance = Math.sqrt(dx * dx + dz * dz);
        
        float yaw = (float) Math.toDegrees(Math.atan2(dz, dx)) - 90;
        float pitch = (float) (-Math.toDegrees(Math.atan2(dy, distance)));
        
        return new float[]{yaw, pitch};
    }
    
    public static void setRotation(float yaw, float pitch) {
        mc.player.setYaw(yaw);
        mc.player.setPitch(pitch);
    }
    
    public static float getYawToEntity(net.minecraft.entity.Entity entity) {
        return getRotation(entity.getX(), entity.getY() + entity.getHeight() / 2, entity.getZ())[0];
    }
    
    public static float getPitchToEntity(net.minecraft.entity.Entity entity) {
        return getRotation(entity.getX(), entity.getY() + entity.getHeight() / 2, entity.getZ())[1];
    }
}
