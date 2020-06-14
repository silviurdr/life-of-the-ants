package com.codecool.lotants;

import java.util.Random;

public class Utils {


    public static int randomNumberGenerator() {
        Random rnd = new Random();
        int randomNum = rnd.nextInt(NestLoader.antsNest.length - 1);
        return randomNum;
    }

    public static int randomDirectionForWorkers() {
        Random rnd = new Random();
        int[] possibleDirections = {1, -1};
        int randomDirection = (int) rnd.nextInt(2);
        return possibleDirections[randomDirection];
    }

}
