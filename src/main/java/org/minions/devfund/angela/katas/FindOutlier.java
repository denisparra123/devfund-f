package org.minions.devfund.angela.katas;

import java.util.Arrays;

/**
 * Finds the unique odd or even number.
 */
final class FindOutlier {

    /**
     * Private constructor.
     */
    private FindOutlier() {

    }

    /**
     * Finds the unique odd or even number.
     *
     * @param integers the array whe to find the unique number.
     * @return int the unique number.
     */
    static int find(final int[] integers) {
        final int maxSize = 3;
        final int sum = Arrays.stream(integers).limit(maxSize).map(i -> Math.abs(i) % 2).sum();
        final int mod = sum <= 1 ? 1 : 0;

        return Arrays.stream(integers).parallel()
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}
