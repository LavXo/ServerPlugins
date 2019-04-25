package me.server.plugins.chatCommands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

/*
    Dariusz Wołkowski ©2019
*/
public class ClearChat implements CommandExecutor {
    private String linia = "&6&m---------------------";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("cc") || cmd.getName().equalsIgnoreCase("clear")) {
            if ((args.length == 0) && (sender.hasPermission("chat.clear") || sender.isOp()))
            {
                for (int i = 0; i < 150; i++)
                    Bukkit.broadcastMessage(" ");
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', linia));
                Bukkit.broadcastMessage(ChatColor.GOLD + "             Chat zostal wyczyszczony!");
                Bukkit.broadcastMessage(ChatColor.GRAY + "           Przez: " + sender.getName());
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', linia));
            }
            else if ((args.length == 1) && (sender.hasPermission("chat.clear") || sender.isOp()))
            {
                for (int i = 0; i < Integer.parseInt(args[0]); i++)
                    Bukkit.broadcastMessage(" ");
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', linia));
                Bukkit.broadcastMessage(ChatColor.GOLD + "             Usunięto " + args[0] + " wiadomości!");
                Bukkit.broadcastMessage(ChatColor.GRAY + "           Przez: " + sender.getName());
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', linia));
            }
            else if ((args.length>=2)&&(sender.hasPermission("chat.clear")||sender.isOp()))
                sender.sendMessage("Zła składnia komendy, skonsultuj się z lekarzem lub farmaceutą.");
            else
                sender.sendMessage("Brak permissji");
            return true;
        }
        return false;
    }
}

