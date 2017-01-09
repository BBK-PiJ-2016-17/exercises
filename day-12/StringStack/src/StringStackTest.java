/**
 * Created by ginestraferraro on 09/01/2017.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class StringStackTest {

    // I need to test:
    //      void push(String newText)
    //      String pop()
    //      String peek()
    //      boolean isEmpty()

    @Before
    public void setUp() {
        // Execute before each test
        System.out.println("@Before setUp()");
        ArrayStringStack stringStackTest = new ArrayStringStack();
    }

    @Ignore
    @Test
    public void pushTest() {

    }

    @Ignore
    @Test
    public void popTest() {

    }

    @Ignore
    @Test
    public void peekTest() {

    }

    @Test
    public void isEmptyTest() {
        assertTrue("failure - should be true", true);
    }

    @After
    public void tearDown() {
        // Execute after each test
        System.out.println("@After tearDown()");
    }

}
