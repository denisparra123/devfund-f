package org.minions.devfund.angela.katas;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Test for {@link AreSame}.
 */
public class AreSameTest {

    /**
     * Verifies if one array contains the other squared element array.
     */
    @Test
    public void test1() {
        final int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        final int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertTrue(AreSame.comp(a, b));
    }
}
