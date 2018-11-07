package me.kayde.plugin.Managers;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class Roulette {
    private ArrayList<Player> players;
    private Player starter;
    public Roulette(Player starter){
        this.starter = starter;
        players = new ArrayList<>();
    }


    public boolean Start(){



        //do the killing


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
