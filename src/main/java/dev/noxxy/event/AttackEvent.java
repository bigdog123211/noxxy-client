package dev.noxxy.event;

import net.minecraft.util.hit.HitResult;

public class AttackEvent {
    private final Object target;
    private boolean cancelled = false;
    
    public AttackEvent(Object target) {
        this.target = target;
    }
    
    public Object getTarget() { return target; }
    public boolean isCancelled() { return cancelled; }
    public void setCancelled(boolean cancelled) { this.cancelled = cancelled; }
}
