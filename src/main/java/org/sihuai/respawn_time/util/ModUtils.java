package org.sihuai.respawn_time.util;

import net.minecraft.client.player.LocalPlayer;
import org.sihuai.respawn_time.Config;

import java.util.Random;

public class ModUtils {
    /**
     * 获取玩家复活时间
     *
     * @return 复活时间
     */
    public static int getRespawnWaitTime() {
        return new Random().nextInt(Config.DEFAULT_RESPAWN_TIME_MIN.get(),
                Config.DEFAULT_RESPAWN_TIME_MAX.get());
    }
}
