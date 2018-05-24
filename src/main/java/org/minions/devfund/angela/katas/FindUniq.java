package org.minions.devfund.angela.katas;

import java.util.Arrays;

/**
 * Finds the uniq element on array.
 */
final class FindUniq {

    /**
     * Private constructor.
     */
    private FindUniq() {

    }

    /**
     * Finds the uniq element on array.
     *
     * @param arr the array to fins elements
     * @return double with the unique element.
     */
    static double findUniq(final double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}
