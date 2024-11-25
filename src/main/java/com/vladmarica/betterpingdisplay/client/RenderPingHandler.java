package com.vladmarica.betterpingdisplay.client;

import com.vladmarica.betterpingdisplay.Config;
import com.vladmarica.betterpingdisplay.mixin.PlayerTabOverlayInvoker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.PlayerTabOverlay;
import net.minecraft.client.multiplayer.PlayerInfo;

public final class RenderPingHandler {
  private static final int PING_TEXT_RENDER_OFFSET = -13;

  public static void render(
      Minecraft mc,
      PlayerTabOverlay overlay,
      GuiGraphics graphics,
      int width,
      int x,
      int y,
      PlayerInfo player) {

    String pingString = String.format(Config.getTextFormatString(), player.getLatency());
    int pingStringWidth = mc.font.width(pingString);
    int pingTextColor =
        Config.shouldAutoColorText()
            ? PingColors.getColor(player.getLatency())
            : Config.getTextColor();

    int textX = width + x - pingStringWidth;
    if (Config.shouldRenderPingBars()) {
      textX += PING_TEXT_RENDER_OFFSET;
    }

    // Draw the ping text
    graphics.drawString(mc.font, pingString, textX, y, pingTextColor);

    // Draw the ping bars
    if (Config.shouldRenderPingBars()) {
      ((PlayerTabOverlayInvoker) overlay).invokeRenderPingIcon(graphics, width, x, y, player);
    }
  }
}
