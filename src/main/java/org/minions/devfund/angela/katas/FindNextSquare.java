package org.minions.devfund.angela.katas;

/**
 * Finds the next square number.
 */
final class FindNextSquare {

    /**
     * Private constructor.
     */
    private FindNextSquare() {

    }

    /**
     * Finds the next square number.
     *
     * @param sq the number to get next square.
     * @return next square number.
     */
    static long findNextSquare(final long sq) {
        final double number = Math.sqrt(sq);
        return number != Math.floor(number) ? -1 : (long) ((number + 1) * (number + 1));
    }
}
