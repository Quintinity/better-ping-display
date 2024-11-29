# Better Ping Display

[![](https://img.shields.io/curseforge/dt/292038?style=for-the-badge&logo=curseforge&label=Downloads&color=rgb(241%2C%20100%2C%2054))](https://www.curseforge.com/minecraft/mc-mods/better-ping-display) [![](https://img.shields.io/modrinth/dt/better-ping-display?style=for-the-badge&logo=modrinth&logoColor=rgb(27%2C%20217%2C%20106)&label=Downloads&color=rgb(27%2C%20217%2C%20106))](https://modrinth.com/mod/better-ping-display)

A mod for Minecraft to display each player's ping in the player list as a number. There is also a config file
for changing the text color and format.

![](https://vladmarica.com/assets/minecraft/better-ping-display.png)

This is a client-side mod. The server doesn't need to have it installed. It works even when playing on vanilla servers.

## Configuration
This mod's config file is `betterpingdisplay-client.toml`. It contains the following options:

| Option            | Default Value  | Description  |
|-------------------|---|---|
| autoColorText | `true` | Whether to color a player's ping based on their latency. E.g, low latency = green, high latency = red |
| renderPingBars    | `false` | Whether to also draw the default Minecraft ping bars  |
| textColor         | `#A0A0A0`  | The ping text color to use. Only works whens `autoColorText` is false |
| textFormatString  | `%dms` | The format string for ping text. Must include a `%d`, which will be replaced dynamically by the actual ping value.

## Requirements
* [Minecraft Forge](http://files.minecraftforge.net) (1.20 and older)
* [NeoForge](https://neoforged.net) (1.21 and newer)
