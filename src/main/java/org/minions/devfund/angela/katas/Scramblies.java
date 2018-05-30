package org.minions.devfund.angela.katas;

import java.util.Arrays;

/**
 * Scrambles words.
 */
final class Scramblies {

    /**
     * Private constructor.
     */
    private Scramblies() {

    }

    /**
     * Verifies if word of string 2 can be formed with letters in string 1.
     *
     * @param str1 String string 1.
     * @param str2 String string 2.
     * @return true if word of string 2 can be formed with letters in string 1.
     */
    static boolean scramble(final String str1, final String str2) {
        final String[] newString = {str1};
        Arrays.stream(str2.split("")).forEach(letter ->
                newString[0] = newString[0].replaceFirst(letter, ""));
        return newString[0].length() == str1.length() - str2.length();
    }
}
