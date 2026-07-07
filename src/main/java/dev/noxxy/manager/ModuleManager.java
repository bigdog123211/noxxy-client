package dev.noxxy.manager;

import dev.noxxy.NoxxyClient;
import dev.noxxy.module.*;
import dev.noxxy.module.combat.*;
import dev.noxxy.module.movement.*;
import dev.noxxy.module.player.*;
import dev.noxxy.module.render.*;
import dev.noxxy.module.world.*;
import dev.noxxy.module.exploit.*;
import dev.noxxy.module.misc.*;
import dev.noxxy.module.hud.*;

import java.util.*;

public class ModuleManager {
    private final NoxxyClient client;
    private final List<Module> modules = new ArrayList<>();
    private final Map<String, Module> moduleMap = new HashMap<>();
    private final Map<String, List<Module>> categorizedModules = new HashMap<>();
    
    public ModuleManager(NoxxyClient client) {
        this.client = client;
    }
    
    public void registerAllModules() {
        // Combat
        registerModule(new KillAuraModule());
        registerModule(new TriggerBotModule());
        registerModule(new AimAssistModule());
        registerModule(new AutoClickerModule());
        registerModule(new ReachModule());
        registerModule(new CriticalsModule());
        registerModule(new VelocityModule());
        registerModule(new AutoBlockModule());
        registerModule(new HitBoxesModule());
        registerModule(new BacktrackModule());
        registerModule(new TargetStrafeModule());
        registerModule(new ShieldBreakerModule());
        
        // Movement
        registerModule(new SpeedModule());
        registerModule(new SprintModule());
        registerModule(new FlyModule());
        registerModule(new LongJumpModule());
        registerModule(new HighJumpModule());
        registerModule(new StepModule());
        registerModule(new SpiderModule());
        registerModule(new NoSlowModule());
        registerModule(new SafeWalkModule());
        registerModule(new FastLadderModule());
        registerModule(new GlideModule());
        registerModule(new JesusModule());
        registerModule(new InventoryMoveModule());
        registerModule(new PhaseModule());
        
        // Player
        registerModule(new AutoToolModule());
        registerModule(new AutoArmorModule());
        registerModule(new FastPlaceModule());
        registerModule(new FastBreakModule());
        registerModule(new ChestStealerModule());
        registerModule(new InventoryCleanerModule());
        registerModule(new AutoEatModule());
        registerModule(new AutoFishModule());
        registerModule(new NoFallModule());
        registerModule(new AntiAFKModule());
        registerModule(new BlinkModule());
        registerModule(new AutoRespawnModule());
        
        // Render
        registerModule(new ESPModule());
        registerModule(new PlayerESPModule());
        registerModule(new ChestESPModule());
        registerModule(new ItemESPModule());
        registerModule(new TracersModule());
        registerModule(new NametagsModule());
        registerModule(new FullbrightModule());
        registerModule(new XRayModule());
        registerModule(new BlockOverlayModule());
        registerModule(new ChamsModule());
        registerModule(new FreecamModule());
        registerModule(new NoHurtCamModule());
        
        // World
        registerModule(new ScaffoldModule());
        registerModule(new NukerModule());
        registerModule(new TimerModule());
        registerModule(new FastMineModule());
        registerModule(new AutoMineModule());
        registerModule(new AntiVoidModule());
        registerModule(new EagleModule());
        registerModule(new AutoBuildModule());
        registerModule(new ChestAuraModule());
        
        // Exploit
        registerModule(new PingSpoofModule());
        registerModule(new DisablerModule());
        registerModule(new AntiBotModule());
        registerModule(new AntiKnockbackModule());
        registerModule(new PacketDelayModule());
        registerModule(new FakeLagModule());
        
        // Misc
        registerModule(new AutoGGModule());
        registerModule(new AutoQueueModule());
        registerModule(new ChatSpammerModule());
        registerModule(new AnnouncerModule());
        registerModule(new DiscordRPCModule());
        registerModule(new FriendsListModule());
        registerModule(new MacrosModule());
        registerModule(new WaypointsModule());
        
        // HUD
        registerModule(new ClickGUIModule());
        registerModule(new KeystrokesModule());
        registerModule(new RadarModule());
        registerModule(new CrosshairEditorModule());
        registerModule(new WatermarkModule());
        registerModule(new FPSCounterModule());
        registerModule(new CPSCounterModule());
        registerModule(new PingDisplayModule());
        registerModule(new CoordinatesModule());
        registerModule(new DirectionModule());
        registerModule(new PotionEffectsModule());
        registerModule(new ArmorHUDModule());
        registerModule(new TargetHUDModule());
        registerModule(new SessionStatsModule());
        registerModule(new BPSCounterModule());
        registerModule(new ClockModule());
        registerModule(new InventoryHUDModule());
        registerModule(new ArrayListModule());
    }
    
    public void registerModule(Module module) {
        modules.add(module);
        moduleMap.put(module.getName(), module);
        
        String category = module.getCategory();
        categorizedModules.computeIfAbsent(category, k -> new ArrayList<>()).add(module);
        
        client.getEventBus().register(module);
    }
    
    public List<Module> getModules() {
        return new ArrayList<>(modules);
    }
    
    public Module getModule(String name) {
        return moduleMap.get(name);
    }
    
    public List<Module> getModulesByCategory(String category) {
        return categorizedModules.getOrDefault(category, new ArrayList<>());
    }
    
    public Set<String> getCategories() {
        return categorizedModules.keySet();
    }
}
