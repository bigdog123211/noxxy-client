package dev.noxxy.client;

import net.fabricmc.api.ClientModInitializer;
import dev.noxxy.NoxxyClient;

public class NoxxyClientInitializer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Initialize Noxxy Client
        NoxxyClient.getInstance();
    }
}
