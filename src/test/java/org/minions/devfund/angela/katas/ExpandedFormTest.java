package org.minions.devfund.angela.katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ExpandedForm}.
 */
public class ExpandedFormTest {

    /**
     * Verifies that expanded form of a number is returned.
     */
    @Test
    public void testSomething() {
        final int num = 12;
        assertEquals("10 + 2", ExpandedForm.expandedForm(num));
        final int num1 = 42;
        assertEquals("40 + 2", ExpandedForm.expandedForm(num1));
        final int num2 = 70304;
        assertEquals("70000 + 300 + 4", ExpandedForm.expandedForm(num2));
    }
}
