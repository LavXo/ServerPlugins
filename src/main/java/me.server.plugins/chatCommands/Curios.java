package me.server.plugins.chatCommands;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Curios implements CommandExecutor {
    int random;
    String[] curios = {
            "Kot ma cztery lapy. Wow!",
            "Ryba nie ma nóg. OmO",
            "Koń to koń. OwO!",
            "Kura była pierwsza. UwU!",
            "Jajko było pierwsze. UmU!",
            "Herbatniki są dobre. UbU!",
            "Ośmiornica pływa. UoU"
    };

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] arg) {
        if(command.getName().equalsIgnoreCase("curios")){
            Player player = (Player)sender;
            Random rnd = new Random();
            random = rnd.nextInt(curios.length);
            sender.sendMessage(ChatColor.DARK_RED + "Twoja ciekawostka: " + ChatColor.GOLD + curios[random]);
            player.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1,1);
        }
        return false;
    }
}
