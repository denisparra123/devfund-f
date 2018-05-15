package org.minions.devfund.yuri.battleship;

/**
 * Represents a Destroyer.
 */
public class Destroyer extends Ship {

    public static final int SQUARES = 4;

    /**
     * Constructor method.
     */
    public Destroyer() {
        super();
        length = SQUARES;
    }
    @Override
    public String getShipType() {
        return "Destroyer";
    }
}
