package bizu.commands;

import bizu.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.jar.Attributes;

public class AGUI {

    private Main main;

    private Inventory inv = Bukkit.createInventory(null, 27, main.getYamlFile("lang.yml", true).get("aguiname").toString().replace("&","§"));
    public AGUI(Main main){
        this.main = main;
        initialize();
    }


    public Inventory getInv(){
        return inv;
    }

    private void initialize(){
        inv.setItem(6, createItem("§2Items disponibles", Material.BOOK));
        inv.setItem(12, createItem("§2Inventaire des Accessoires", Material.COMPASS));
    }



    private ItemStack createItem(String name, Material material) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);

        item.setItemMeta(meta);
        return item;
    }
}
