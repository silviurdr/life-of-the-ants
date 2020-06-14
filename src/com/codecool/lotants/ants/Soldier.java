package com.codecool.lotants.ants;

import com.codecool.lotants.Ant;

public class Soldier extends Ant {

    private static final String soldierType = "\033[0;35m" +  "S" + "\033[0m";

    public Soldier() {
        super(soldierType);
    };

    @Override
    public void move() {
    }
}
