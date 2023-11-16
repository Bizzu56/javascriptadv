package bizu.FilesManager;

import bizu.Main;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class YamlLoading {

    private Main main;
    private File file;

    public YamlLoading(String fileName, Main main) {
        this.main = main;

    }

    public YamlLoading() {
    }

    public YamlConfiguration loadFile(String name, boolean isRootDir){

        if(isRootDir){
            file = new File(main.getDataFolder(), name);
            YamlConfiguration yaml = new YamlConfiguration();
            try {
                yaml.load(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InvalidConfigurationException e) {
                throw new RuntimeException(e);
            }
            return yaml;
        }
        else{
            file = new File(main.getDataFolder() + "/content", name);
            YamlConfiguration yaml = new YamlConfiguration();
            try {
                yaml.load(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InvalidConfigurationException e) {
                throw new RuntimeException(e);
            }
            return yaml;
        }


    }

    public void createFile(Main main, String ymlFileName) {
        file = new File(main.getDataFolder() + "/content", ymlFileName);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            main.saveResource("/content/" + ymlFileName, false);
        }

            YamlConfiguration customConfig = new YamlConfiguration();
            try {
                customConfig.load(file);
                main.setYamlFile(customConfig);
            } catch (IOException | InvalidConfigurationException e) {
                e.printStackTrace();
            }

        }
    }
