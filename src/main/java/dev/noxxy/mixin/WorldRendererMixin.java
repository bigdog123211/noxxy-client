package dev.noxxy.mixin;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(WorldRenderer.class)
public abstract class WorldRendererMixin {
    @Shadow
    protected abstract void setupTerrain(net.minecraft.client.render.Camera camera, net.minecraft.util.math.Frustum frustum, boolean hasForcedFrustum, int frame, boolean spectator);
}
