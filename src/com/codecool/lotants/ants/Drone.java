package com.codecool.lotants.ants;

import com.codecool.lotants.Ant;

public class Drone extends Ant {

    private final static String droneType = "\033[0;33m" +  "D" + "\033[0m";

    public Drone() {
        super(droneType);
    }

    @Override
    public void move() {
    }
}
