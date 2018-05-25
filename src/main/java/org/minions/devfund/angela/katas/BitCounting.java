package org.minions.devfund.angela.katas;

/**
 * Converts the number to binary and count 1's digit.
 */
final class BitCounting {

    /**
     * Private constructor.
     */
    private BitCounting() {

    }

    /**
     * Converts the number to binary and count 1's number.
     *
     * @param n int number to convert o binary.
     * @return quantity of ones.
     */
    static int countBits(int n) {
        return Integer.bitCount(n);
    }
}
