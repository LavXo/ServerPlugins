package me.server.plugins.tools;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class LightningWand implements Listener {
    @EventHandler
    final void onStickClick(PlayerInteractEvent event){
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();
        if(item.getType() == Material.STICK){
            player.getWorld().strikeLightning(player.getEyeLocation());
            player.sendMessage("You're wizGAYzard Harry.");
        }

    }
}
