package org.minions.devfund.angela.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Xbonacci}.
 */
public class XbonacciTest {

    /**
     * Verifies if xbonacci returns the n array numbers.
     */
    @Test
    public void basicTests() {
        final double[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        final int length = 10;
        assertArrayEquals(expected, Xbonacci.xbonacci(new double[]{0, 1}, length));
        final double[] expected1 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        assertArrayEquals(expected1, Xbonacci.xbonacci(new double[]{1, 1}, length));
        final double[] expected2 = {0, 0, 0, 0, 1, 1, 2, 4, 8, 16};
        assertArrayEquals(expected2, Xbonacci.xbonacci(new double[]{0, 0, 0, 0, 1}, length));
        final double[] expected3 = {1, 0, 0, 0, 0, 0, 1, 2, 3, 6};
        assertArrayEquals(expected3, Xbonacci.xbonacci(new double[]{1, 0, 0, 0, 0, 0, 1}, length));
    }

    /**
     * Simplifies assertion.
     *
     * @param expected array with expected numbers.
     * @param actual   array with actual numbers.
     */
    private void assertArrayEquals(final double[] expected, final double[] actual) {
        for (int i = 0; i < actual.length; i++) {
            final double delta = 1e-10;
            assertEquals(expected[i], actual[i], delta);
        }
    }
}
