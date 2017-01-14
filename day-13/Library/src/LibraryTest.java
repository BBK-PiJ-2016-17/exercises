/**
 * Day 13 - Practicing TDD
 * Tests
 *
 * @author Ginestra Ferraro
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class LibraryTest {

    @Before
    public void MockBook() {
        BookImpl firstBook = new BookImpl("Mark Twain", "The Million Pound Bank Note");

        System.out.println("Author: " + firstBook.getAuthor() + "/nTitle: " + firstBook.getTitle());
    }

    @Ignore
    @Test
    public void testTitle() {

    }
}
