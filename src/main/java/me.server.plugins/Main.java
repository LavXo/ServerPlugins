package me.server.plugins;

import me.server.plugins.chatCommands.ClearChat;
import me.server.plugins.chatCommands.Curios;
import me.server.plugins.events.PlayerLogin;
import me.server.plugins.events.PlayerQuit;
import me.server.plugins.events.PlayerHoldingGoldenApple;
import me.server.plugins.tools.LightningWand;
import org.bukkit.plugin.java.JavaPlugin;

/*
    Dariusz Wołkowski ©2019
*/

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerLogin(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuit(), this);
        getServer().getPluginManager().registerEvents(new PlayerHoldingGoldenApple(), this);
        getServer().getPluginManager().registerEvents(new LightningWand(), this);
        getCommand("clear").setExecutor(new ClearChat());
        getCommand("cc").setExecutor(new ClearChat());
        getCommand("ciekawostka").setExecutor(new Curios());



        getLogger().info("Uruchomiono LavXo Plugin Box");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("Wylaczam LavXo Plugin Box");
    }


}
