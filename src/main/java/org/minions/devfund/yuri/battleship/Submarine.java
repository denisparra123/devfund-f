package org.minions.devfund.yuri.battleship;

/**
 * Represents a submarine.
 */
public class Submarine extends Ship{

    public static final int SQUARES = 3;

    /**
     * Constructor Method.
     */
    public Submarine() {
        super();
        length = SQUARES;
    }

    @Override
    public String getShipType() {
        return "SubMarine";
    }
}
