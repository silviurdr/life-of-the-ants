package com.codecool.lotants;


public abstract class Ant {

    private int xPosition;
    private int yPosition;
    private String antType;
    private String antFootprint;

    String[][] nest = NestLoader.antsNest;
    private int randomX, randomY;

    public String getAntFootprint() {
        return antFootprint;
    }

    public void setAntFootprint(String antFootprint) {
        this.antFootprint=antFootprint;
    }

    private void determineAntPosition() {

        do {
            xPosition = randomX=Utils.randomNumberGenerator();
            yPosition = randomY=Utils.randomNumberGenerator();

        } while (nest[randomX][randomY] != "*");
    }

    public Ant(String antType) {
        determineAntPosition();
        this.antType = antType;
        this.xPosition = randomX;
        this.yPosition = randomY;
        NestLoader.antsNest[xPosition][yPosition] = this.antType;
    }

    public int getxPosition() {return xPosition; }

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


    public String getAntType() {
        return antType;
    }


}
