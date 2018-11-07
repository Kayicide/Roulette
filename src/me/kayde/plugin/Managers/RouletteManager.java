package me.kayde.plugin.Managers;

import java.util.ArrayList;
import org.bukkit.entity.Player;

public class RouletteManager {
    private ArrayList<Roulette> roulettes; //maybe change this into a dictionary in the future, the key may be helpful for finding values
    public RouletteManager(){
        roulettes = new ArrayList<>();
    }

    public boolean createRoulette(Player player){
        for(Roulette r : roulettes){
            if(r.getStarter() == player){
                return false;
            }
        }
        Roulette temp = new Roulette(player);
        roulettes.add(temp);
        return true;
    }
    public Roulette getRoutlette(Player player) {
        for (Roulette r : roulettes) {
            if (r.getStarter() == player) {
                return r;
            }
        }
        return null;
    }

    public boolean startRoulette(Player player){
        if(getRoutlette(player) != null){
            getRoutlette(player).Start();
            return true;
        }
        return false;
    }



}
