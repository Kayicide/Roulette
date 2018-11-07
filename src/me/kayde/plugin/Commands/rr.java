package me.kayde.plugin.Commands;

import me.kayde.plugin.Managers.RouletteManager;
import me.kayde.plugin.TestingSkills;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rr implements CommandExecutor {
    TestingSkills plugin;
    public rr(TestingSkills plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player))
            return false;
        Player player = (Player)commandSender;

        plugin.rrManager.createRoulette(player);

        //Sets up the chat commands which is clickable(not finished the join command that it triggers)
        TextComponent announcement1 = new TextComponent(player.getDisplayName() +  " has started a roulette! Click This Message to Join!");
        announcement1.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/rrJoin " + player.getName()));
        //send the message to all players on the server
        for(Player p: Bukkit.getOnlinePlayers()){
            p.spigot().sendMessage(announcement1);
        }
        return true;
    }
}
