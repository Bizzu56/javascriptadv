package bizu.aPlayers;

import bizu.Accessories.Accessorie;
import bizu.Passive.Passive;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class aPlayers {

    private Player player;
    private ArrayList<Accessorie> accessories;

    public aPlayers(Player player){
        this.player = player;
    }

    public ArrayList<Accessorie> playerAccessorie(){
        return this.accessories;
    }

    public Accessorie searchAccessorieWithId(int ID){

        for(Accessorie accessorie : accessories){
            if(accessorie.getId() == ID){
                return accessorie;
            }
        }
        return null;
    }

    public Player getPlayer() {
        return player;
    }
    public ArrayList<Passive> getAllPassives() {

        ArrayList<Passive> passives = new ArrayList<>();

        for(Accessorie a : accessories){
            passives.add(a.getPassive());
        }
        return passives;
    }
}
