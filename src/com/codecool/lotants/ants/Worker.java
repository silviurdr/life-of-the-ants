package com.codecool.lotants.ants;

import com.codecool.lotants.*;
import com.codecool.lotants.Utils;

public class Worker extends Ant {

    private static final String workerName="Worker";
    private static String workerType="\033[0;32m" + "W" + "\033[0m";
    private static String workerFootprint="\033[0;32m" + "-" + "\033[0m";

    public Worker() {
        super(workerType, workerName);
        this.setAntFootprint(workerFootprint);
    }

    @Override
    public void move() {

        while (true) {
            int nextYPosition=this.getyPosition() + Utils.randomDirectionForWorkers();
            System.out.println(nextYPosition);
            if (nextYPosition > -1 && nextYPosition < 30) {
                this.setyPosition(nextYPosition);
                break;
            } else continue;
        }

        while (true) {
            int nextXPosition=this.getxPosition() + Utils.randomDirectionForWorkers();
            System.out.println(nextXPosition);
            if (nextXPosition > -1 && nextXPosition < 30) {
                this.setxPosition(nextXPosition);
                break;
            } else continue;
        }
    }
}
