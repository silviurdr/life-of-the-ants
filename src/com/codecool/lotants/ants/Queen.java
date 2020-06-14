package com.codecool.lotants.ants;

import com.codecool.lotants.Ant;
import com.codecool.lotants.Utils;

public class Queen extends Ant {

    public static final String queenType = "\033[0;36m" +  "Q" + "\033[0m";

    public Queen() {
        super(queenType);
    }

    @Override
    public void move() {
        System.out.println("Nu ma misc!n");
    }
}
