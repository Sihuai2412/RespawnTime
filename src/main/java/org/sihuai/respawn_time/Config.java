package org.sihuai.respawn_time;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {

    public static ModConfigSpec.IntValue DEFAULT_RESPAWN_TIME_MIN;
    public static ModConfigSpec.IntValue DEFAULT_RESPAWN_TIME_MAX;

    static void register(ModContainer container) {
        ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
        DEFAULT_RESPAWN_TIME_MIN = BUILDER.comment(
                "The min value of the default respawn time"
        ).defineInRange("defaultRespawnTimeMin", 3, 0, Integer.MAX_VALUE);
        DEFAULT_RESPAWN_TIME_MAX = BUILDER.comment(
                "The max value of the default respawn time"
        ).defineInRange("defaultRespawnTimeMax", 8, 0, Integer.MAX_VALUE);
        container.registerConfig(ModConfig.Type.COMMON, BUILDER.build());
    }
}
