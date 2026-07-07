package dev.noxxy.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockUtil {
    private static final MinecraftClient mc = MinecraftClient.getInstance();
    
    public static void breakBlock(BlockPos pos) {
        mc.interactionManager.attackBlock(pos, net.minecraft.util.math.Direction.UP);
    }
    
    public static void placeBlock(BlockPos pos, net.minecraft.util.math.Direction face) {
        mc.interactionManager.interactBlock(
            mc.player,
            net.minecraft.util.Hand.MAIN_HAND,
            new net.minecraft.util.hit.BlockHitResult(
                pos.toCenterPos(),
                face,
                pos,
                false
            )
        );
    }
    
    public static boolean isAir(BlockPos pos) {
        return mc.world.getBlockState(pos).getMaterial().isReplaceable();
    }
    
    public static net.minecraft.block.Block getBlock(BlockPos pos) {
        return mc.world.getBlockState(pos).getBlock();
    }
}
