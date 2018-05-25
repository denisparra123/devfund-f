package org.minions.devfund.angela.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link FindOutlier}.
 */
public class FindOutlierTest {

    /**
     * Verifies if finds the unique odd or even number.
     */
    @Test
    public void testExample() {
        final int[] exampleTest1 = {2, 6, 8, -10, 3};
        final int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        final int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        final int expected = 3;
        assertEquals(expected, FindOutlier.find(exampleTest1));
        final int expected1 = 206847684;
        assertEquals(expected1, FindOutlier.find(exampleTest2));
        assertEquals(0, FindOutlier.find(exampleTest3));
    }
}
