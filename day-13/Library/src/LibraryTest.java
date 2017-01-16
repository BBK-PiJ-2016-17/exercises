/**
 * Day 13 - Practicing TDD
 * Tests
 *
 * @author Ginestra Ferraro
 */

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class LibraryTest {

    private Book firstBook, secondBook, thirdBook; // Important: define the object here, to make it visible to @Test
    private User userOne, userTwo;
    private Library libOne;

    @Before
    public void setUp() {
        firstBook = new BookImpl("Mark Twain", "The Million Pound Bank Note");
        secondBook = new BookImpl("Fred Vargas", "The Three Evangelists");
        thirdBook = new BookImpl("Sadie Smith", "White Teeth");

        userOne = new UserImpl("This Guy");
        userTwo = new UserImpl("That Guy");

        libOne = new LibraryImpl("British Library"); // libName now set at construction time
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

        userTwo.setLibraryID(17);
        assertEquals(id, userTwo.getLibraryID());
    }

    @Test
    public void registerTest() {
        assertEquals(24, userOne.register(libOne));
    }

    @Test
    public void libraryNameTest() {
        assertEquals("British Library", libOne.getLibName());
    }

    @Test
    public void libraryIDTest() {
        assertEquals(24, libOne.getLibID());
    }

    @Ignore
    @Test
    public void maxNumBooksPerUserTest() {
       // assertTrue(numBooksBorrowed <= 3);
    }

    @After
    public void cleanUp() {
        firstBook = null;
        secondBook = null;
        thirdBook = null;

        userOne = null;
        userTwo = null;
    }
}
