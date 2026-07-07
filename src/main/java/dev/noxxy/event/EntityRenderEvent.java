package dev.noxxy.event;

import net.minecraft.entity.Entity;

public class EntityRenderEvent {
    private final Entity entity;
    private final double x, y, z;
    
    public EntityRenderEvent(Entity entity, double x, double y, double z) {
        this.entity = entity;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Entity getEntity() { return entity; }
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }
}
