package com.codecool.lotants.ants;

import com.codecool.lotants.Ant;
import com.codecool.lotants.Utils;

public class Drone extends Ant {

    private final static String droneType="\033[0;31m" + "D" + "\033[0m";
    private final static String droneFootprint="\033[0;31m" + "-" + "\033[0m";
    private static final String droneName="Drone";
    private static boolean queenHoneyMoon=false;
    private static int daysWithTheQueen=10;

    public Drone() {
        super(droneType, droneName);
        this.setAntFootprint(droneFootprint);
    }

    public static boolean isHoneyMoonEnded() {
        if (daysWithTheQueen == 0) {
            return true;
        } else return false;
    }

    public static int getDaysWithTheQueen() {
        return daysWithTheQueen;
    }

    public static void setDaysWithTheQueen(int daysWithTheQueen) {
        Drone.daysWithTheQueen=daysWithTheQueen;
    }

    public static boolean isQueenHoneyMoon() {
        return queenHoneyMoon;
    }

    public static void startQueenHoneyMoon() {
        queenHoneyMoon=true;
    }

    public static void endQueenHoneyMoon() {
        queenHoneyMoon=false;
    }

    public static void runQueenHoneyMoon() {
        daysWithTheQueen--;
    }

    @Override
    public void move() {

    }

    public void move(int queenXPosition, int queenYPosition, Queen queen) {

        if (queenHoneyMoon) {
            if (daysWithTheQueen == 0) {
                throwAwayDrone(queen);
            } else daysWithTheQueen--;
        } else {
            if (this.getyPosition() > 15) {
                this.setyPosition(this.getyPosition() - 1);
            } else if (this.getyPosition() < 15) {
                this.setyPosition(this.getyPosition() + 1);
            }

            if (this.getxPosition() > 15) {
                this.setxPosition(this.getxPosition() - 1);
            } else if (this.getxPosition() < 15) {
                this.setxPosition(this.getxPosition() + 1);
            }
        }

    }

    public void throwAwayDrone(Queen queen) {

        this.setxPosition(queen.getxPosition() + Utils.randomDronesThrowingDistance().get(0));
        this.setyPosition(queen.getyPosition() + Utils.randomDronesThrowingDistance().get(1));

    }

    public boolean checkIfQueenIsClose(int queenXPosition, int queenYPosition) {
        if ((Math.abs(queenXPosition - getxPosition())) + (Math.abs(queenYPosition - getyPosition())) < 3) {
            return true;
        }
        return false;
    }

}
