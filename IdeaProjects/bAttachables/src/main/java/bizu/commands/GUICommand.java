package bizu.commands;

import bizu.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GUICommand implements CommandExecutor {


    private Main main;

    public GUICommand(Main main){
        this.main = main;
    }
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player){
            Player p = (Player) commandSender;

            if(command.getName().equalsIgnoreCase("agui")){
                p.openInventory(new AGUI(main).getInv());
            }

        }


        return false;
    }



}
