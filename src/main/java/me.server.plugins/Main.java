package me.server.plugins;

import me.server.plugins.chatCommands.ClearChat;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/*
    Dariusz Wołkowski ©2019
*/

public class Main extends JavaPlugin {
    @Override
    public void onEnable()
    {
        this.getLogger().info("Trwa uruchamianie chatu...");

        getCommand("clear").setExecutor(new ClearChat());

        getLogger().info("Uruchomiono...");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("Wylaczanie...");
    }


}
