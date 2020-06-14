package com.codecool.lotants.ants;

import com.codecool.lotants.Ant;

public class Drone extends Ant {

    private final static String droneType = "\033[0;33m" +  "D" + "\033[0m";
    private final static String droneFootprint = "\033[0;33m" +  "-" + "\033[0m";

    public Drone() {
        super(droneType);
        this.setAntFootprint(droneFootprint);
    }

    @Override
    public void move() {
    }
}
