package org.sihuai.respawn_time;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = RespawnTime.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static ModConfigSpec.IntValue DEFAULT_RESPAWN_TIME_MIN;
    public static ModConfigSpec.IntValue DEFAULT_RESPAWN_TIME_MAX;

    static final ModConfigSpec SPEC = BUILDER.build();

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        DEFAULT_RESPAWN_TIME_MIN = BUILDER.comment(
                "The min value of the default respawn time"
        ).defineInRange("defaultRespawnTimeMin", 3, 0, Integer.MAX_VALUE);
        DEFAULT_RESPAWN_TIME_MAX = BUILDER.comment(
                "The max value of the default respawn time"
        ).defineInRange("defaultRespawnTimeMax", 8, 0, Integer.MAX_VALUE);
    }
}
