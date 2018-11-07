package me.kayde.plugin.Commands;

import me.kayde.plugin.TestingSkills;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rrRemove implements CommandExecutor{
    TestingSkills plugin;
    public rrRemove(TestingSkills plugin){
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(!(commandSender instanceof Player))
            return false;
        Player player = (Player)commandSender;


        if(args.length == 0){
            if(plugin.rrManager.removeRoulette(player))
              return true;
            player.sendMessage("You have not started a roulette yet!");
        }else{
            if(plugin.rrManager.removeRoulette(Bukkit.getServer().getPlayer(args[0])))
                return true;
            player.sendMessage("That player has not started a roulette yet!");
        }
        return false;
    }
}
