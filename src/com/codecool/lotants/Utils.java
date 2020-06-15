package com.codecool.lotants;

import java.util.ArrayList;
import java.util.Random;

public class Utils {


    public static int randomNumberGenerator() {
        Random rnd=new Random();
        int randomNum=rnd.nextInt(NestLoader.antsNest.length - 1);
        return randomNum;
    }

    public static int randomDirectionForWorkers() {
        Random rnd=new Random();
        int[] possibleDirections={1, -1};
        int randomDirection=(int) rnd.nextInt(2);
        return possibleDirections[randomDirection];
    }

    public static ArrayList<Integer> randomDronesThrowingDistance() {
        ArrayList<Integer> randomDistances=new ArrayList();
        ArrayList<Integer> xRandomDistances=new ArrayList();
        Random rnd=new Random();
        int xRandomDistance=(rnd.nextInt(15));
        xRandomDistances.add(xRandomDistance);
        xRandomDistances.add(-xRandomDistance);
        int choseXRandomDistance=xRandomDistances.get(rnd.nextInt(2));
        int choseYRandomDistance;
        choseYRandomDistance=choseXRandomDistance > 0 ? choseXRandomDistance - 14 : 14 + choseXRandomDistance;
        randomDistances.add(choseXRandomDistance);
        randomDistances.add(choseYRandomDistance);
        return randomDistances;
    }

}
