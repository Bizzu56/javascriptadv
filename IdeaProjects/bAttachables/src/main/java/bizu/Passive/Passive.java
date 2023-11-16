package bizu.Passive;

import org.bukkit.configuration.file.YamlConfiguration;

public class Passive {

    private int value;


    public Passive(YamlConfiguration passiveArea){
        addParameters(passiveArea);
    }

    



    public void addParameters(YamlConfiguration yamlConfiguration){
        for(String keys : yamlConfiguration.getKeys(false)) {
            switch (keys) {
                case "value":
                    this.value = (int) yamlConfiguration.get("passive.value");
                    break;
                case "type":
                    switch((String )yamlConfiguration.get("passive.type")){
                        case "regen_power":
                            break;
                        case "dmg_multiplier":
                            break;
                        case "dmg_reducer":
                            break;
                        case "grow_faster":
                            break;
                    }
            }
        }
    }

}
