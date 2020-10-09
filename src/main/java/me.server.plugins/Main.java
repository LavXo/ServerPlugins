package me.server.plugins;

import me.server.plugins.chatCommands.ClearChat;
import me.server.plugins.chatCommands.Curios;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/*
    Dariusz Wołkowski ©2019
*/

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getLogger().info("Trwa uruchamianie chatu...");

        getCommand("clear").setExecutor(new ClearChat());
        getCommand("cc").setExecutor(new ClearChat());
        getCommand("ciekawostka").setExecutor(new Curios());

        getLogger().info("Uruchamiam LavXo Plugin Box");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("Wylaczam LavXo Plugin Box");
    }


}
