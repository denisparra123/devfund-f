package org.minions.devfund.angela.katas;

import java.util.Arrays;

/**
 * Obtains xbonacci array.
 */
final class Xbonacci {

    /**
     * Private constructor.
     */
    private Xbonacci() {

    }

    /**
     * Obtains the fibonacci series but sum array length numbers quantity.
     *
     * @param signature the array with base numbers.
     * @param n         the result length.
     * @return the new array with the array plus its sum.
     */
    static double[] xbonacci(final double[] signature, final int n) {
        final int x = signature.length;
        double[] result = Arrays.copyOf(signature, n);
        for (int i = x; i < n; i++) {
            result[i] = Arrays.stream(result, i - x, i).sum();
        }
        return result;
    }
}
