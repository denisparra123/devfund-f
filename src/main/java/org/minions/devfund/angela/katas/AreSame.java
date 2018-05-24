package org.minions.devfund.angela.katas;

import java.util.Arrays;

/**
 * Verifies if one array contains the other squared element array.
 */
final class AreSame {

    /**
     * Private constructor.
     */
    private AreSame() {

    }

    /**
     * Verifies if one array contains the other squared element array.
     *
     * @param a first array.
     * @param b squared array.
     * @return true if array contains the other squared.
     */
    public static boolean comp(final int[] a, final int[] b) {
        return a != null && b != null && a.length == b.length
                && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(),
                Arrays.stream(b).sorted().toArray());
    }
}
