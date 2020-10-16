package me.server.plugins.chatCommands;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.concurrent.ThreadLocalRandom;

public class Curios implements CommandExecutor {
    int random;
    String[] curios = {
            "Kot ma cztery lapy. Wow!",
            "Krzys to cham. Yeah!",
            "Sandra jest gruba. OwO!",
            "Kura byla pierwsza. UwU!",
            "Nie no serio Krzys to grubas. UmU!",
            "Frytunie są dobre. Pamiętaj UbU!",
            "Kapeć musi capić. Tak jak Krzysiu. UoU"
    };

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] arg) {
        if(command.getName().equalsIgnoreCase("curios")){
            Player player = (Player)sender;
            random = ThreadLocalRandom.current().nextInt(5);
            sender.sendMessage(ChatColor.DARK_RED + "Twoja ciekawostka: " + ChatColor.GOLD + curios[random]);
            player.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1,1);
        }
        return false;
    }
}
