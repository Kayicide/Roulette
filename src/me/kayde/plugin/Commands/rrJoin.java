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
        Player found;
        if(((found = Bukkit.getServer().getPlayer(args[0])) != null) && plugin.rrManager.getRoutlette(found) != null){
            plugin.rrManager.getRoutlette(found).addPlayer(player);
            player.sendMessage("You have joined " + args[0] + "'s Roulette. Good Luck!");
            return true;
        }
        player.sendMessage("This roulette was not found!");
        return false;
    }
}
