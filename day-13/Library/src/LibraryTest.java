/**
 * Day 13 - Practicing TDD
 * Tests
 *
 * @author Ginestra Ferraro
 */

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
// import org.junit.Ignore;
import org.junit.Test;

public class LibraryTest {

    private Book firstBook, secondBook, thirdBook; // Important: define the object here, to make it visible to @Test
    private User userOne, userTwo;

    @Before
    public void setUp() {
        firstBook = new BookImpl("Mark Twain", "The Million Pound Bank Note");
        secondBook = new BookImpl("Fred Vargas", "The Three Evangelists");
        thirdBook = new BookImpl("Sadie Smith", "White Teeth");

        userOne = new UserImpl("This Guy");
    }

    @Test
    public void authorTest() {
        String output = "Mark Twain";
        String input = firstBook.getAuthor();

        assertEquals(output, input);
    }

    @Test
    public void titleTest() {
        String output = "White Teeth";
        String input = thirdBook.getTitle();

        assertEquals(output, input);
    }

    @Test
    public void userNameTest() {
        String nameOut = "This Guy";
        String nameIn = userOne.getName();

        assertEquals(nameOut, nameIn);
    }

    @Test
    public void userGetIDTest() {
        int id = 0;

        assertEquals(id, userOne.getLibraryID());
    }

    @Test
    public void userSetIDTest() {
        int id = 17;

        userOne.setLibraryID(17);
        assertEquals(id, userOne.getLibraryID());
    }

    @After
    public void cleanUp() {
        firstBook = null;
        secondBook = null;
        thirdBook = null;
    }
}
