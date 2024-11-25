package com.vladmarica.betterpingdisplay;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.neoforged.fml.common.Mod;

@Mod(value = BetterPingDisplayMod.MODID, dist = Dist.CLIENT)
public class BetterPingDisplayMod {
  public static final Logger logger = LogManager.getLogger();

  public static final String MODID = "betterpingdisplay";

  public BetterPingDisplayMod(ModContainer container) {
    container.registerConfig(ModConfig.Type.CLIENT, Config.SPEC);
  }
}
