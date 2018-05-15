package org.minions.devfund.yuri.battleship;

/**
 * Represents to light cruiser.
 */
public class LightCruiser extends Ship {

    public static final int SQUARES = 5;

    /**
     * Constructor method.
     */
    public LightCruiser() {
        super();
        length = SQUARES;
    }
    @Override
    public String getShipType() {
        return "LightCruiser";
    }
}
