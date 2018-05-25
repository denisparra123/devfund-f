package org.minions.devfund.angela.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link FindNextSquare}.
 */
public class FindNextSquareTest {

    /**
     * Verifies next square number of 121 is 144.
     */
    @Test
    public void test1() {
        final int expected = 144;
        final int sq = 121;
        assertEquals(expected, FindNextSquare.findNextSquare(sq));
    }

    /**
     * Verifies next square number of 625 is 676.
     */
    @Test
    public void test2() {
        final int expected = 676;
        final int sq = 625;
        assertEquals(expected, FindNextSquare.findNextSquare(sq));
    }

    /**
     * Verifies next square number of 144 doesn't exist because
     * it isn't squared number, so it returns -1.
     */
    @Test
    public void test3() {
        final int expected = -1;
        final int sq = 114;
        assertEquals(expected, FindNextSquare.findNextSquare(sq));
    }

}
