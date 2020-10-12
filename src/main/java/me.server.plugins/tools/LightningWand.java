package me.server.plugins.tools;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class LightningWand implements Listener, CommandExecutor {
    @EventHandler
    final void onStickClick(PlayerInteractEvent event){
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInMainHand();
        if(item.getType() == Material.STICK){
            try{
                player.getWorld().strikeLightning(player.getTargetBlockExact(250).getLocation());
            }
            catch (NullPointerException e){}
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("wizzard")){
            ItemStack stick = new ItemStack(Material.STICK, 1);
            Player player = (Player)sender;
            player.getInventory().addItem(stick);
        }
        return false;
    }
}
