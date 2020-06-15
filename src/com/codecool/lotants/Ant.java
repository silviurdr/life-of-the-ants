package com.codecool.lotants;


import com.codecool.lotants.ants.Queen;

public abstract class Ant {

    String[][] nest=NestLoader.antsNest;
    private int xPosition;
    private int yPosition;
    private String antType;
    private String antFootprint;
    private String antName;
    private int randomX, randomY;


    public Ant(String antType, String antName) {
        determineAntPosition();
        this.antType=antType;
        this.antName=antName;
        this.xPosition=randomX;
        this.yPosition=randomY;
        NestLoader.antsNest[xPosition][yPosition]=this.antType;
    }

    public Ant(String antType, String antName, int x, int y) {
        this.antType=antType;
        this.antName=antName;
        this.xPosition=x;
        this.yPosition=y;
        NestLoader.antsNest[xPosition][yPosition]=this.antType;
    }


    public String getAntName() {
        return antName;
    }

    public String getAntFootprint() {
        return antFootprint;
    }

    public void setAntFootprint(String antFootprint) {
        this.antFootprint=antFootprint;
    }

    private void determineAntPosition() {

        do {
            xPosition=randomX=Utils.randomNumberGenerator();
            yPosition=randomY=Utils.randomNumberGenerator();

        } while (nest[randomX][randomY] != "*");
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition=xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition=yPosition;
    }

    public abstract void move();

    public void move(int x, int y) {

    }

    ;


    public String getAntType() {
        return antType;
    }


    public void move(int getxPosition, int getyPosition, Queen queen) {
    }

    ;
}
