package org.minions.devfund.yuri.battleship;

/**
 * Represents an Empty Sea.
 */
public class EmptySea extends Ship {
    /**
     * Constructor method.
     */
    public EmptySea() {
        super();
        length = 1;
    }

    @Override
    public boolean shootAt(final int row, final int column) {
        return false;
    }

    @Override
    public boolean isSunk() {
        return false;
    }

    @Override
    public String toString() {
        return "ES";
    }

    @Override
    public String getShipType() {
        return "empty";
    }
}
