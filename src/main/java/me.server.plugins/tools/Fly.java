package me.server.plugins.tools;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player player = (Player)sender;
        if(command.getName().equalsIgnoreCase("fly")){
            if(!player.getAllowFlight()){
                player.setAllowFlight(true);
                player.sendMessage("Fly is now ON!");
            }
            else {
                player.setAllowFlight(false);
                player.sendMessage("Fly is now OFF!");
            }
        }

        return false;
    }
}
