/**
 * 2 Classics
 *
 * 2.1 a) Factorial
 * Write a small program with a method that calculates the factorial of an integer number as seen in the notes.
 * Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
 * one takes too long, try the other way.
 */

public class FactorialIterative {

    private int i;
    private int result;

    public int factorialIterative(int n) {

        result = n;

        for (i = n; i > 1; i--) {
            if (n == 1) {
                return 1;
            } else {
                result = result * (n - 1);
                n--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FactorialIterative test = new FactorialIterative();
        test.launch();
    }

    public void launch() {
        System.out.println("The factorial of 4 is: " + factorialIterative(4));
    }
}