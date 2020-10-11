package me.server.plugins.events;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class PlayerLogin implements Listener {
    @EventHandler
    final void onPlayerLogin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 100,1);
        event.setJoinMessage(ChatColor.GOLD + "Siema siema kurwa witam " + ChatColor.RED + player.getName());
    }
}
