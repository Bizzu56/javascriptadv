package bizu.Events;

import bizu.aPlayers.aPlayers;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageEvent implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent e){
        if(e.getEntity() instanceof Player){
            aPlayers aPlayers = new aPlayers((Player) e.getEntity());
            aPlayers.getAllPassives().forEach(passive -> {
                if(passive.)
            });
        }
    }
}
