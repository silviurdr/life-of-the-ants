package com.codecool.lotants.ants;

import com.codecool.lotants.Ant;

import java.util.Random;

public class Queen extends Ant {

    private static final String queenType="\033[0;36m" + "Q" + "\033[0m";
    private static final String queenName="Queen";
    Random rnd=new Random();
    private int moodCounter=rnd.nextInt(30 - 20) + 20;

    public Queen() {
        super(queenType, queenName, 15, 15);
    }

    public void updateQueenMood() {
        this.moodCounter-=1;
    }

    public boolean isQueenInTheMood() {
        if (this.moodCounter <= 0) {
            return true;
        } else return false;
    }

    public void resetQueenMoodCounter() {
        this.moodCounter=rnd.nextInt(30 - 20) + 20;
    }

    public int getMoodCounter() {
        return this.moodCounter;
    }

    @Override
    public void move() {
    }
}
