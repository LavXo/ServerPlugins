package me.server.plugins.chatCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Random;

public class Curios implements CommandExecutor {
    Random rnd = new Random();
    String[] curios = {
            "Kot ma cztery lapy. Wow!",
            "Krzys to cham. Yeah!",
            "Sandra jest gruba. OwO!",
            "Kura byla pierwsza. UwU!",
            "Nie no serio Krzys to grubas. UmU!"
    };

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {
        if(cmd.getName().equalsIgnoreCase("ciekawostka")){
            int random = rnd.nextInt(5);
            sender.sendMessage("Twoja ciekawostka: " + curios[random]);
        }
        return false;
    }
}
