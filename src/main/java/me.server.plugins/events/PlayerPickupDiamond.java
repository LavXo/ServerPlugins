package me.server.plugins.events;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerPickupDiamond implements Listener {

    @EventHandler
    public final void onPlayerPickupDiamond(Player event){
        Player player = event.getPlayer();
    }
}
