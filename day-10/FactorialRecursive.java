/**
 * 2 Classics
 *
 * 2.1 a) Factorial
 * Write a small program with a method that calculates the factorial of an integer number as seen in the notes.
 * Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
 * one takes too long, try the other way.
 */

public class FactorialRecursive {
    private int n;
    private int result;
    public int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            int result = n * factorialRecursive(n-1);
            return result;
        }
    }

    public static void main(String[] args) {
        FactorialRecursive test = new FactorialRecursive();
        test.launch();
    }

    public void launch() {
        System.out.println("The factorial of 4 is: " + factorialRecursive(4));
    }
}