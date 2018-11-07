package me.kayde.plugin.Commands;

import me.kayde.plugin.Managers.Roulette;
import me.kayde.plugin.TestingSkills;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rrStart implements CommandExecutor {
    TestingSkills plugin;
    public rrStart(TestingSkills plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player))
            return false;
        Player player = (Player)commandSender;
        if(plugin.rrManager.startRoulette(player) == true)
            return true;
        player.sendMessage("You have not created a roulette yet!");
        return false;
    }
}
