package me.kayde.plugin.Commands;

import me.kayde.plugin.TestingSkills;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rrJoin implements CommandExecutor {
    private TestingSkills plugin;
    public rrJoin(TestingSkills plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(!(commandSender instanceof Player))
            return false;
        Player player = (Player)commandSender;

        for(Player p: Bukkit.getOnlinePlayers()){
            if(player.getDisplayName().equals(args[0])){
                plugin.rrManager.getRoutlette(p).addPlayer(player);
                player.sendMessage("You have joined " + args[0] + "'s Roulette. Good Luck!");
                return true;
            }
        }
        return false;
    }
}
