package bizu.Events;

import bizu.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClicks implements Listener {

    private Main main;

    public InventoryClicks(Main main){
        this.main = main;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e){
        if(e.getView().getTitle().equals(main.getYamlFile("lang.yml", true).get("aguiname").toString().replace("&","§"))){
            e.setCancelled(true);
            if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName()){
                if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§2Items disponibles")){
                    // OUVRE INVENTAIRE ITEMS DISPO
                }
                if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§2Inventaire des Accessoires")){
                    // OUVRE INVENTAIRE EQUIPEMENT ACCESSOIRES
                }
            }
        }
    }
}