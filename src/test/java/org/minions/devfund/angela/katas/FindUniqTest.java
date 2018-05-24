package org.minions.devfund.angela.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link FindUniq}.
 */
public class FindUniqTest {

    /**
     * Verifies find unique gets the different number in the array.
     */
    @Test
    public void sampleTestCases() {
        final double precision = 0.0000000000001;
        assertEquals(1.0, FindUniq.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUniq.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}
