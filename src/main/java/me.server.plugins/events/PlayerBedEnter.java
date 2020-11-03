package me.server.plugins.events;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class PlayerBedEnter implements Listener {

    @EventHandler
    public final void onPlayerBedEnter(PlayerBedEnterEvent event){
        Player player = event.getPlayer();

        event.getBed().getWorld().spawn(event.getBed().getLocation(), TNTPrimed.class);
        event.getBed().setType(Material.AIR);

        

    }
}
