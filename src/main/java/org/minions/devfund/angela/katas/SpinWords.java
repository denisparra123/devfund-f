package org.minions.devfund.angela.katas;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Reverses the word if are more than 4 length.
 */
final class SpinWords {

    /**
     * Private constructor.
     */
    private SpinWords() {

    }

    /**
     * Reverses the word if are more than 4 length.
     *
     * @param sentence string sentence.
     * @return string the sentence with word reversed.
     */
    static String spinWords(final String sentence) {
        final int minLengthToSpin = 4;
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > minLengthToSpin ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }
}
