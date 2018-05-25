package org.minions.devfund.angela.katas;

/**
 * Joins the strings, sort and distinct the letters.
 */
final class TwoToOne {

    /**
     * Private constructor.
     */
    private TwoToOne() {

    }

    /**
     * Joins the strings, sort and distinct the letters.
     *
     * @param s1 first string.
     * @param s2 second string.
     * @return the sorted and distinct letters.
     */
    static String longest(final String s1, final String s2) {
        return s1.concat(s2).chars().distinct().sorted().collect(StringBuilder::new,
                StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
