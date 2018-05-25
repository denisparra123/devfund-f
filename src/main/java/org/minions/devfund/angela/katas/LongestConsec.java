package org.minions.devfund.angela.katas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * Gets the longest concatenation of strings.
 */
final class LongestConsec {

    /**
     * Private constructor.
     */
    private LongestConsec() {

    }

    /**
     * Gets the longest concatenation of strings.
     *
     * @param strarr the array of strings.
     * @param k      the numbers of strings to concatenate.
     * @return String with the longest concatenation.
     */
    static String longestConsec(final String[] strarr, final int k) {
        if (k <= 0 || k > strarr.length || strarr.length == 0) {
            return "";
        } else {
            return IntStream.range(0, strarr.length - k + 1)
                    .mapToObj(index -> String.join("", Arrays.copyOfRange(strarr, index, index + k)))
                    .max(Comparator.comparing(String::length)).orElse("");
        }
    }
}
