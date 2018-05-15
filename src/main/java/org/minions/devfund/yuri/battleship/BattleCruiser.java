package org.minions.devfund.yuri.battleship;

/**
 * Represents to BattleCruiser.
 */
public class BattleCruiser extends Ship {

    public static final int SQUARES = 7;

    /**
     *
     */
    public BattleCruiser() {
        super();
        length = SQUARES;
    }

    @Override
    public String getShipType() {
        return "BattleCruiser";
    }
}
