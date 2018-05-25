package org.minions.devfund.angela.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Test for {@link BitCounting}.
 */
public class BitCountingTest {

    /**
     * Verifies if count bits on int numbers.
     */
    @Test
    public void testGame() {
        final int fiveBits = 5;
        final int number1234 = 1234;
        final int number4 = 4;
        final int number7 = 7;
        final int number9 = 9;
        final int number10 = 10;
        final int threeBits = 3;
        assertEquals(fiveBits, BitCounting.countBits(number1234));
        assertEquals(1, BitCounting.countBits(number4));
        assertEquals(threeBits, BitCounting.countBits(number7));
        assertEquals(2, BitCounting.countBits(number9));
        assertEquals(2, BitCounting.countBits(number10));
    }

}
