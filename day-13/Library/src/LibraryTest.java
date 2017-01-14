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
    public void MockBook {
        BookImpl aBook = new BookImpl();
        String author = aBook.getAuthor("Mark Twain");
        String title = aBook.getTitle("The Million Pound Bank Note");

        System.out.println("Author: " + author + "/nTitle: " + title);
    }
}
