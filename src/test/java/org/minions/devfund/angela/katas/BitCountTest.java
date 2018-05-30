package org.minions.devfund.angela.katas;

import org.junit.Test;
import java.math.BigInteger;
import static org.junit.Assert.assertEquals;

/**
 * Test for {@link BitCount}.
 */
public class BitCountTest {

    /**
     * Verifies counts bits between numbers.
     */
    @Test
    public void sampleTests() {
        final int right = 7;
        final int left = 5;
        assertEquals(new BigInteger("7"), BitCount.countOnes(left, right));
        final int left1 = 12;
        final int right1 = 29;
        assertEquals(new BigInteger("51"), BitCount.countOnes(left1, right1));
    }
}
