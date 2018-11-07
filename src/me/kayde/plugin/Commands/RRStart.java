package me.kayde.plugin.Commands;

import me.kayde.plugin.TestingSkills;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RRStart implements CommandExecutor {
    TestingSkills plugin;
    public RRStart(TestingSkills plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player))
            return false;
        Player player = (Player)commandSender;




        return false;
    }
}
