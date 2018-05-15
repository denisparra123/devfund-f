package org.minions.devfund.yuri.battleship;

/**
 * Represents to Cruiser.
 */
public class Cruiser extends Ship {

    public static final int SQUARES = 6;

    /**
     * Constructor method.
     */
    public Cruiser() {
        super();
        length = SQUARES;
    }
    @Override
    public String getShipType() {
        return "Cruiser";
    }
}
