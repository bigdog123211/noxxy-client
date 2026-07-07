package dev.noxxy.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.Packet;

public class PacketUtil {
    private static final MinecraftClient mc = MinecraftClient.getInstance();
    
    public static void sendPacket(Packet<?> packet) {
        if (mc.getNetworkHandler() != null) {
            mc.getNetworkHandler().sendPacket(packet);
        }
    }
    
    public static void sendChatMessage(String message) {
        mc.getNetworkHandler().sendPacket(
            new net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket(message)
        );
    }
    
    public static void sendCommand(String command) {
        sendChatMessage("/" + command);
    }
}
