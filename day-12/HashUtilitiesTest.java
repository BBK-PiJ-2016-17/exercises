/**
 * Test HashUtilities
*/

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HashUtilitiesTest {

    // 1
    @Test
    public void testsHash() {
        HashUtilities hash = new HashUtilities();
        int input = 23456789;
        int output = hash.shortHash(input);
        int expected = 789;
        assertEquals(output, expected);
    }

    // 2
    @Test
    public void testsHash2() {
        HashUtilities hash = new HashUtilities();
        int input = 15158;
        int output = hash.shortHash(input);
        int expected = 158;
        assertEquals(output, expected);
    }

    // 3
    @Test
    public void testsZero() {
        HashUtilities hash = new HashUtilities();
        int input = 0;
        int output = hash.shortHash(input);
        int expected = 0;
        assertEquals(output, expected);
    }

    // 4
    @Test
    public void tests1000() {
        HashUtilities hash = new HashUtilities();
        int input = 1000;
        int output = hash.shortHash(input);
        int expected = 0;
        assertEquals(output, expected);
    }

    // 5
    // Try to fail - It fails, good!
    // @Test
    // public void tests1000again() {
    //     HashUtilities hash = new HashUtilities();
    //     int input = 1000;
    //     int output = hash.shortHash(input);
    //     int expected = 1;
    //     assertEquals(output, expected);
    // }

    // 6
    @Test
    public void tests1001() {
        HashUtilities hash = new HashUtilities();
        int input = 1001;
        int output = hash.shortHash(input);
        int expected = 1;
        assertEquals(output, expected);
    }

}