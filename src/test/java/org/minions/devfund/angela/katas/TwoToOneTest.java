package org.minions.devfund.angela.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link TwoToOne}.
 */
public class TwoToOneTest {

    /**
     * Verifies if returns the letters sorted and distinct.
     */
    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }
}
