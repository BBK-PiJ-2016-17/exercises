import sun.jvm.hotspot.utilities.FindObjectByType;

/**
 * Day 14 (Swapped with day 15)
 *
 * Ex 2 - Memoized Fibonacci
 * Memoization is not always necessary, but in some cases it can really speed up
 * computation, as in this exercise.
 * Write a Java class with a with a method that calculates the nth element of
 * the Fibonacci sequence as seen in the notes. Note: Remember that when a
 * method is a pure function without side-effects, it is good practice to make
 * it static. Does any or both versions of this method qualify?
 * Do it with and without memoization. Compare the time that is needed in each
 * case to find F(40) or F(45).
 * What is the maximum Fibonacci number you can calculate in Java using int?
 * And using long? Hint: Remember that both types have a maximum value as they
 * are only 32 and 64 bits long. Look at the Java documentation to find the
 * maximum value in each case.
 */

// Need to find out mroe about tail recursion
    
public class FibonacciMemoized {
    public static void main(String[] args) {
        FibonacciMemoized test = new FibonacciMemoized();
        test.launch();
    }

    public void launch() {

    }


}
