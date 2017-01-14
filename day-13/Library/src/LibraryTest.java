/**
 * Day 13 - Practicing TDD
 * Tests
 *
 * @author Ginestra Ferraro
 */

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertTrue;

// import org.junit.After;
import org.junit.Before;
// import org.junit.Ignore;
import org.junit.Test;

public class LibraryTest {

    private BookImpl firstBook; // Important: define the object here, to make it visible to @Test

    @Before
    public void setUp() {
        firstBook = new BookImpl("Mark Twain", "The Million Pound Bank Note");
    }

    @Test
    public void testTitle() {

        String output = "Mark Twain";
        String input = firstBook.getAuthor();

        assertEquals(output, input);

    }
}
