package org.sihuai.respawn_time;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(RespawnTime.MOD_ID)
public class RespawnTime {
    public static final String MOD_ID = "respawn_time";

    public RespawnTime(IEventBus modEventBus, ModContainer modContainer) {
        Config.register(modContainer);
    }
}
