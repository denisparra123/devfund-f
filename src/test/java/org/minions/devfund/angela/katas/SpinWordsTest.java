package org.minions.devfund.angela.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link SpinWords}.
 */
public class SpinWordsTest {

    /**
     * Verifies if more than 4 length words in a sentence were reversed.
     */
    @Test
    public void test() {
        assertEquals("emocleW", SpinWords.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", SpinWords.spinWords("Hey fellow warriors"));
    }
}
