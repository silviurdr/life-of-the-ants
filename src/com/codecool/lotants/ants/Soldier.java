package com.codecool.lotants.ants;

import com.codecool.lotants.Ant;

public class Soldier extends Ant {

    private int defendXPosition = this.getxPosition();
    private int defendYPosition = this.getyPosition();

    private static final String soldierType = "\033[0;35m" +  "S" + "\033[0m";
    private static final String soldierFootprint = "\033[0;35m" +  "-" + "\033[0m";

    public Soldier() {
        super(soldierType);
        this.setAntFootprint(soldierFootprint);
    };

    @Override
    public void move() {
        System.out.println("The soldier moves!");

        if (this.getxPosition() == defendXPosition && this.getyPosition() == defendYPosition) {
            if ((this.getxPosition() - 1) < 0) {
                this.setxPosition(defendXPosition);
                this.setyPosition(this.defendYPosition + 1);
            } else  this.setxPosition(this.getxPosition() - 1);
        } else if (this.getxPosition() == defendXPosition - 1) {
            if ((this.defendYPosition + 1) > 29) {
                this.setxPosition(this.defendXPosition + 1);
                this.setyPosition(this.defendYPosition);
            } else {
                this.setxPosition(defendXPosition);
                this.setyPosition(this.defendYPosition + 1);
            }
        } else if (this.getyPosition() == defendYPosition + 1) {
            if ((this.defendXPosition + 1) > 29) {
                this.setxPosition(defendXPosition);
                this.setyPosition(this.defendYPosition - 1);
            } else {
                this.setxPosition(this.defendXPosition + 1);
                this.setyPosition(this.defendYPosition);
            }
        } else if (this.getxPosition() == defendXPosition + 1) {
            if ((this.defendYPosition - 1) < 0) {
                this.setxPosition(this.getxPosition() - 1);
                this.setyPosition(defendYPosition);
            } else {
                this.setxPosition(defendXPosition);
                this.setyPosition(this.defendYPosition - 1);
            }
        } else if (this.getyPosition() == defendYPosition - 1) {
            if ((this.getxPosition() - 1) < 0) {
                this.setxPosition(this.getxPosition());
                this.setyPosition(defendYPosition);
            } else {
                this.setxPosition(this.getxPosition() - 1);
                this.setyPosition(defendYPosition);
            }
        }
    }
}
