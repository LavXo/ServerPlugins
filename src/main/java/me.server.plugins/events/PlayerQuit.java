package me.server.plugins.events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {
    @EventHandler
    final void onPlayerQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.RED + player.getName() + ChatColor.GOLD + " wypierdziela :o!");
    }
}
