package org.minions.devfund.angela.katas;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link LongestConsec}.
 */
public class LongestConsecTest {

    /**
     * Assertion for equals.
     *
     * @param actual   actual result.
     * @param expected expected result.
     */
    private static void testing(final String actual, final String expected) {
        assertEquals(expected, actual);
    }

    /**
     * Test that verifies the longest concatenation.
     */
    @Test
    public void test() {
        System.out.println("longestConsec Fixed Tests");
        testing(LongestConsec.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta",
                "abigail"}, 2), "abigailtheta");
        testing(LongestConsec.longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb",
                "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
        final int k1 = 3;
        testing(LongestConsec.longestConsec(new String[]{}, k1), "");
        testing(LongestConsec.longestConsec(new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv",
                "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2),
                "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        testing(LongestConsec.longestConsec(new String[]{"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"},
                2), "wlwsasphmxxowiaxujylentrklctozmymu");
        final int k2 = -2;
        testing(LongestConsec.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas"}, k2),
                "");
        testing(LongestConsec.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, k1),
                "ixoyx3452zzzzzzzzzzzz");
        final int k = 15;
        testing(LongestConsec.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, k),
                "");
        testing(LongestConsec.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 0),
                "");
    }
}
