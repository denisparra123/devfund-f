package org.minions.devfund.angela.katas;

import java.math.BigInteger;

/**
 * Counts bits.
 */
final class BitCount {

    /**
     * Private constructor.
     */
    private BitCount() {

    }

    /**
     * Counts bits between numbers.
     *
     * @param left  first number.
     * @param right second number
     * @return bits numbers.
     */
     static BigInteger countOnes(final long left, final long right) {
        BigInteger bits = BigInteger.valueOf(0);
        for (long i = left; i <= right && Long.bitCount(i) > 0; i++) {
            bits = bits.add(BigInteger.valueOf(Long.bitCount(i)));
        }
        return bits;
    }
}
