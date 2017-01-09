/**
 * Day 12 - Ex 3 Practice ”Find bugs once” - TEST
 *
 * The method getInitials(String) has a bug! If you introduce a name with more than one space between words,
 * it throws an exception.
 * Create a class that contains the method getInitials(String) as described in the notes. Create also the test
 * class as described in the notes.
 * Then follow the “find bugs once” algorithm: reproduce the bug manually, reproduce the bug programmatically
 * by adding a new test to the testing class, then fix the bug and check that all tests pass.
 *
 * @author Ginestra Ferraro
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindBugsOnceTest {

    @Test
    public void testsNormalName() {
        FindBugsOnce test = new FindBugsOnce();
        String input = "Dereck Robert Yssirt";
        String output = test.getInitials(input);
        String expected = "DRY";
        assertEquals(expected, output);
    }

    @Test
    public void failTestNormalName() {
        FindBugsOnce test = new FindBugsOnce();
        String input = "Dereck  Robert Yssirt";
        String output = test.getInitials(input);
        String expected = "DRY";
        assertEquals(expected, output);
    }

}
