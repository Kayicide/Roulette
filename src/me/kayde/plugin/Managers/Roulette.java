package me.kayde.plugin.Managers;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.Random;

public class Roulette {
    private ArrayList<Player> players;
    private Player starter;
    private int rounds;
    public Roulette(Player starter){
        this.starter = starter;
        players = new ArrayList<>();
    }
    //this could be used to have more than one rounds, the default being moving but optional extra rounds.
    public Roulette(Player starter, int rounds){
        this(starter);
        this.rounds = rounds;
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
                p.sendMessage("Click! You've survived this round!");
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

    //Could be used to add stakes to the randomness ;-;
    //public void addBet(){}
}
