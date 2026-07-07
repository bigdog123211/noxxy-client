package dev.noxxy.util;

import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;

public class InventoryUtil {
    private static final MinecraftClient mc = MinecraftClient.getInstance();
    
    public static ItemStack getItemInHand() {
        return mc.player.getMainHandStack();
    }
    
    public static ItemStack getItemInOffhand() {
        return mc.player.getOffHandStack();
    }
    
    public static void setHotbarSlot(int slot) {
        if (slot >= 0 && slot <= 8) {
            mc.player.getInventory().selectedSlot = slot;
        }
    }
    
    public static int getHotbarSlot() {
        return mc.player.getInventory().selectedSlot;
    }
    
    public static boolean hasItem(net.minecraft.item.Item item) {
        for (ItemStack stack : mc.player.getInventory().main) {
            if (stack.getItem() == item) {
                return true;
            }
        }
        return false;
    }
    
    public static void clickSlot(int slot, int button, SlotActionType type) {
        if (mc.interactionManager != null) {
            mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, slot, button, type, mc.player);
        }
    }
}
