package dev.noxxy.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;

public class PlayerUtil {
    private static final MinecraftClient mc = MinecraftClient.getInstance();
    
    public static void jump() {
        mc.player.setVelocity(mc.player.getVelocity().x, 0.42, mc.player.getVelocity().z);
        mc.player.velocityModified = true;
    }
    
    public static void setMotion(double x, double y, double z) {
        mc.player.setVelocity(x, y, z);
        mc.player.velocityModified = true;
    }
    
    public static void addMotion(double x, double y, double z) {
        Vec3d vel = mc.player.getVelocity();
        mc.player.setVelocity(vel.x + x, vel.y + y, vel.z + z);
        mc.player.velocityModified = true;
    }
    
    public static boolean isMoving() {
        return mc.player.input.pressingForward || mc.player.input.pressingBack || 
               mc.player.input.pressingLeft || mc.player.input.pressingRight;
    }
    
    public static void setSprinting(boolean sprinting) {
        mc.player.setSprinting(sprinting);
    }
    
    public static float getSpeed() {
        Vec3d vel = mc.player.getVelocity();
        return (float) Math.sqrt(vel.x * vel.x + vel.z * vel.z);
    }
}
