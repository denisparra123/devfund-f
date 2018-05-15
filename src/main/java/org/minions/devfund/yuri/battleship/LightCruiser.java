package org.minions.devfund.yuri.battleship;

/**
 * Represents to light cruiser.
 */
public class LightCruiser extends Ship {
    /**
     * Constructor method.
     */
    public LightCruiser() {
        super();
        length = 5;
    }
    @Override
    public String getShipType() {
        return "LightCruiser";
    }
}
