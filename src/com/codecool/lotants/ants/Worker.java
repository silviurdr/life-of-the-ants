package com.codecool.lotants.ants;
import com.codecool.lotants.*;
import com.codecool.lotants.Utils;

public class Worker extends Ant {

    private static String workerType = "\033[0;32m" +  "W" + "\033[0m";


    public Worker() {
       super(workerType);
    }

    @Override
    public void  move() {
        this.setyPosition(this.getyPosition() + Utils.randomDirectionForWorkers());
        this.setxPosition(this.getxPosition() + Utils.randomDirectionForWorkers());
    }
}
