package com.codecool.lotants;


public abstract class Ant {

    private int xPosition;
    private int yPosition;
    private String[][] position;
    private String antType;
    private int maxXNestSize = NestLoader.antsNest.length - 1;
    private int maxYNestSize = NestLoader.antsNest[0].length -1 ;

    String[][] nest = NestLoader.antsNest;


    private int randomX, randomY;

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

    public void addInNest(String[][] cell) {
    }

    public String[][] getPosition() {
       return position;
    }

    public void setPosition(String[][] position) {
      this.position=position;
    }

    public String getAntType() {
        return antType;
    }

    public void setAntType(String antType) {
       this.antType=antType;
    }

}
