package bizu;

import bizu.Events.InventoryClicks;
import bizu.FilesManager.YamlLoading;
import bizu.commands.GUICommand;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private YamlConfiguration yamlFile;
    public void onEnable(){
       getCommand("agui").setExecutor(new GUICommand(this));
       getServer().getPluginManager().registerEvents(new InventoryClicks(this), this);
    }

    private void loadYamlFiles() {
        new YamlLoading();
    }

    public void setYamlFile(YamlConfiguration yamlFile){
        this.yamlFile = yamlFile;
    }


    public YamlConfiguration getYamlFile(String yamlFileName, boolean isRootDir) {
        return new YamlLoading().loadFile(yamlFileName, isRootDir);
    }
}
