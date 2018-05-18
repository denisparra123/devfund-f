package org.minions.devfund.mauricioz.Battleship;

/**
 * Ocean class.
 */
public class Ocean {
    private static final int OCEAN_SIZE = 20;
    private Ship[][] ships;
    private int shotsFired;
    private int hitCount;
    private int shipsSunk;

    /**
     * Constructor.
     */
    public Ocean() {
        this.ships = new EmptySea[OCEAN_SIZE][OCEAN_SIZE];
        this.shotsFired = 0;
        this.shipsSunk = 0;
        this.hitCount = 0;
    }

    /**
     * return ships into the ocean.
     * @return ships
     */
    public Ship[][] getShips() {
        return this.ships.clone();
    }

    /**
     * get the total number of shots fired by the user.
     * @return total of shots.
     */
    public int getShotsFired() {
        return shotsFired;
    }

    /**
     * The number of times a shot hit a ship.
     * @return hits.
     */
    public int getHitCount() {
        return hitCount;
    }

    /**
     * The number of ships sunk.
     * @return ships sunk.
     */
    public int getShipsSunk() {
        return shipsSunk;
    }
}
