package com.codecool.lotants;

import com.codecool.lotants.ants.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here


        NestLoader.buildNest();

        for (int i=0; i < 5; i++) {
            Ant worker=new Worker();
            NestLoader.addAnt(worker.getxPosition(), worker.getyPosition(), worker);
            Ant soldier=new Soldier();
            NestLoader.addAnt(soldier.getxPosition(), soldier.getyPosition(), soldier);
            Ant drone=new Drone();
            NestLoader.addAnt(drone.getxPosition(), drone.getyPosition(), drone);
        }
        Queen queen=new Queen();
        NestLoader.addAnt(queen.getxPosition(), queen.getyPosition(), queen);
        NestLoader.drawNest();

        Scanner userInput=new Scanner(System.in);


        while (true) {

            Integer userDecision=userInput.nextInt();
            if (userDecision == 1) {

                if (Drone.isHoneyMoonEnded()) {
                    queen.resetQueenMoodCounter();
                    Drone.endQueenHoneyMoon();
                    Drone.setDaysWithTheQueen(10);
                }
                if (Drone.isQueenHoneyMoon()) {
                    Drone.runQueenHoneyMoon();
                }

                for (Ant ant : NestLoader.nestPopulation) {
                    NestLoader.clearAntPosition(ant.getxPosition(), ant.getyPosition(), ant);
                    if (ant instanceof Drone) {
                        if (Drone.isQueenHoneyMoon()) {
                        } else {
                            ant.move(queen.getxPosition(), queen.getyPosition(), queen);
                            if (((Drone) ant).checkIfQueenIsClose(queen.getxPosition(), queen.getyPosition())) {
                                if (queen.isQueenInTheMood()) {
                                    System.out.println("HALLELUJAH");
                                    ((Drone) ant).startQueenHoneyMoon();

                                } else {
                                    System.out.println("D’OH");
                                    ((Drone) ant).throwAwayDrone(queen);
                                }
                            }
                        }
                    } else {
                        ant.move();
                    }

                    NestLoader.updateAntPosition(ant.getxPosition(), ant.getyPosition(), ant);
                }
                ((Queen) queen).updateQueenMood();
                NestLoader.drawNest();
            } else break;
        }


    }

}
