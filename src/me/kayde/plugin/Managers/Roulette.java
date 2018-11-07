package me.kayde.plugin.Managers;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.Random;

public class Roulette {
    private ArrayList<Player> players;
    private Player starter;
    public Roulette(Player starter){
        this.starter = starter;
        players = new ArrayList<>();
    }


    public boolean Start(){
        Random random = new Random();

        int i;
        for(Player p: players){
            i = random.nextInt(6) + 1;
            if(i == 1){
                p.setHealth(0.0);
                p.sendMessage("Bang!");
                break;
            }else{
                p.sendMessage("Click!");
            }
        }
        return true;
    }

    public Player getStarter(){
        return starter;
    }
    public boolean addPlayer(Player player){
        if(players.contains(player)){
            return false;
        }
        players.add(player);
        return true;
    }
    public boolean removePlayer(Player player){
        if(!players.contains(player)){
           return false;
        }else{
            players.remove(player);
            return true;
        }
    }
}
