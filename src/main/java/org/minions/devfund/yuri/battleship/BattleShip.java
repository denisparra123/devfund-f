package org.minions.devfund.yuri.battleship;

/**
 * Represents to Battle Ship.
 */
public class BattleShip extends Ship {

    public static final int SQUARES = 8;

    /**
     * Constructor Method.
     */
    public BattleShip() {
        super();
        length = SQUARES;
    }
    @Override
    public String getShipType() {
        return "BattleShip";
    }
}
