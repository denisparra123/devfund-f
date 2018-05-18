package org.minions.devfund.mauricioz.Battleship;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * test class for Ocean.
 */
public class OceanTest {
    private static final int OCEAN_SIZE = 20;
    private Ocean ocean;

    /**
     * initial setup.
     */
    @Before
    public void setUp() {
        ocean = new Ocean();
    }

    /**
     * verify the object is created correctly.
     */
    @Test
    public void testEmptySeaIsAShipObject() {
        assertThat(ocean, instanceOf(Ocean.class));
    }

}
