package dev.noxxy.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class EntityUtil {
    private static final MinecraftClient mc = MinecraftClient.getInstance();
    
    public static PlayerEntity getClosestPlayer(float range) {
        if (mc.world == null) return null;
        
        PlayerEntity closest = null;
        float closestDist = range;
        
        for (PlayerEntity player : mc.world.getPlayers()) {
            if (player == mc.player) continue;
            
            float dist = mc.player.distanceTo(player);
            if (dist < closestDist) {
                closestDist = dist;
                closest = player;
            }
        }
        
        return closest;
    }
    
    public static boolean isEntityInRange(Entity entity, float range) {
        return mc.player.distanceTo(entity) <= range;
    }
    
    public static boolean canSeeEntity(Entity entity) {
        Vec3d eyePos = mc.player.getEyePos();
        Vec3d entityPos = entity.getPos().add(0, entity.getHeight() / 2, 0);
        return mc.world.raycast(new net.minecraft.util.hit.RaycastContext(
            eyePos,
            entityPos,
            net.minecraft.util.hit.RaycastContext.ShapeType.OUTLINE,
            net.minecraft.util.hit.RaycastContext.FluidHandling.NONE,
            mc.player
        )).getType() == net.minecraft.util.hit.HitResult.Type.MISS;
    }
    
    public static void attack(Entity entity) {
        mc.interactionManager.attackEntity(mc.player, entity);
        mc.player.swingHand(net.minecraft.util.Hand.MAIN_HAND);
    }
}
