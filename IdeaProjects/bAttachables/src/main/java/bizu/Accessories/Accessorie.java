package bizu.Accessories;

import bizu.Passive.Passive;

public class Accessorie {
    private String name;
    private Passive passive;

    private int id;

    public Accessorie(){

    }

    public Passive getPassive(){
        return this.passive;
    }

    public void addPassive(Passive passive){
        this.passive = passive;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
