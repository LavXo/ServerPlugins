package me.server.plugins.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerHoldingGoldenApple implements Listener {
    @EventHandler
    final void onPlayerHoldingApple(PlayerItemHeldEvent event){
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();
        if(item.getType() == Material.GOLDEN_APPLE) {
            player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_AMBIENT, 1,1);
            Bukkit.broadcastMessage("On czyma japko!");
        }
    }
}
