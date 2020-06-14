package com.codecool.lotants;

import com.codecool.lotants.ants.*;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here


        NestLoader.buildNest();

        for (int i = 0; i < 5; i++) {
            Ant worker = new Worker();
            NestLoader.addAnt(worker.getxPosition(), worker. getyPosition(), worker);
            Ant soldier = new Soldier();
            NestLoader.addAnt(soldier.getxPosition(), soldier. getyPosition(), soldier);
            Ant drone = new Drone();
            NestLoader.addAnt(drone.getxPosition(), drone.getyPosition(), drone);
        }
        Ant queen = new Queen();
        NestLoader.addAnt(queen.getxPosition(), queen.getyPosition(), queen);
        NestLoader.drawNest();

        Scanner userInput = new Scanner(System.in);



        while (true) {
            System.out.println("Press 1 to move the ants or 0 to end the game");

            Integer userDecision = userInput.nextInt();
            if (userDecision == 1) {
                System.out.println("face ceva???");
                for (Ant ant : NestLoader.nestPopulation) {
                    System.out.println("Position before move:" + ant.getxPosition());
                    NestLoader.clearAntPosition(ant.getxPosition(), ant.getyPosition(), ant);
                    ant.move();
                    NestLoader.updateAntPosition(ant.getxPosition(), ant.getyPosition(), ant);
                    System.out.println("Position after move:" + ant.getxPosition());
                }
                NestLoader.drawNest();
            }
            else break;
        }


    }

}
