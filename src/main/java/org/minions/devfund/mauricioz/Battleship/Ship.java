package org.minions.devfund.mauricioz.Battleship;

/**
 * abstract class Ship will have different subclases for each ship type.
 * @
 */
public abstract class Ship {
    private int bowRow;// – the row (0 to 19) which contains the bow (front) of the ship.
    private int bowColumn;// - the column which contains the bow (front) of the ship.
    private int length;// – the number of squares occupied by the ship. An ”empty sea” location has length 1.
    private boolean horizontal;// – true if the ship occupies a single row, false otherwise. Ships will either be placed vertically or horizontally in the ocean.
    private boolean[] hit;// - this is a boolean array of size 8 that record hits. Only battleships use all the locations. The others will use fewer.

    /**
     * Getter for bowRow attribute.
     * @return bowRow attribute.
     */
    public int getBowRow() {
        return bowRow;
    }

    /**
     * Getter for bowColumn attribute.
     * @return bowColumn value.
     */
    public int getBowColumn() {
        return bowColumn;
    }

    /**
     * Getter for length attribute.
     * @return length value.
     */
    public int getLength() {
        return length;
    }

    /**
     * Getter for horizontal attribute.
     * @return horizontal value.
     */
    public boolean isHorizontal() {
        return horizontal;
    }

    /**
     * Getter for hit attribute.
     * @return hit value.
     */
    public boolean[] getHit() {
        return hit;
    }

    /**
     * Setter for bowRow attribute.
     * @param bowRow value.
     */
    public void setBowRow(int bowRow) {
        this.bowRow = bowRow;
    }

    /**
     * Setter for bowColumn attribute.
     * @param bowColumn value.
     */
    public void setBowColumn(int bowColumn) {
        this.bowColumn = bowColumn;
    }

    /**
     * Setter for length attribute.
     * @param length value.
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Setter for horizontal attribute.
     * @param horizontal value.
     */
    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    /**
     * Setter for hit attribute.
     * @param hit value.
     */
    public void setHit(boolean[] hit) {
        this.hit = hit;
    }

    /**
     *
     * @return
     */
    public abstract String getShipType();

    /**
     *
     * @param row
     * @param column
     * @param horizontal
     * @param ocean
     * @return
     */
    public boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean) {
        //TODO
        return true;
    }

    /**
     *
     * @param row
     * @param column
     * @param horizontal
     * @param ocean
     */
    public void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
        //TODO
    }

    /**
     *
     * @param row
     * @param column
     * @return
     */
    public boolean shootAt(int row, int column) {
        //TODO
        return true;
    }

    /**
     *
     * @return
     */
    public boolean isSunk() {
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "";
    }
}
