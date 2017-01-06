/**
 * Test HashUtilities
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HashUtilitiesTest {

    @Test
    public void testsHash() {
        HashUtilities hash = new HashUtilities();
        int input = 23456789;
        int output = hash.shortHash(input);
        int expected = 789;
        assertEquals(output, expected);
    }

}