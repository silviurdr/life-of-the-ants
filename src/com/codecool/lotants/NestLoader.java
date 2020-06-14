package com.codecool.lotants;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.fill;

public class NestLoader {


    static List<Ant> nestPopulation = new ArrayList<Ant>();
    static String[][] antsNest = new String[30][30];

    public static void buildNest() {

        for (String[] row: antsNest) {
            fill(row, "*");
        }
    }

    public static String[][] getAntsNest() {
        return antsNest;
    }

    public static void drawNest() {

        int k = 1;
        while(k <= 90) {
            System.out.print('-');
            k++;
        }
        System.out.println();
        for(int i = 0; i < antsNest.length; i++) {
            for(int j = 0; j < antsNest[i].length; j++) {
                System.out.print("|" + antsNest[i][j] + "|");
            }
            System.out.println();
        }

        k = 1;
        while(k <= 90) {
            System.out.print('-');
            k++;
        }
        System.out.println();
    }

    public static void addAnt(int x, int y, Ant ant) {
        antsNest[x][y] = ant.getAntType();
        nestPopulation.add(ant);
    }

    public static void updateAntPosition(int x, int y, Ant ant) {
        antsNest[x][y] = ant.getAntType();
    }

    public static void clearAntPosition(int x, int y, Ant ant){
        antsNest[x][y] = ant.getAntFootprint();
    }

}
