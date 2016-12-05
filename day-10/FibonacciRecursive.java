/**
 * Ex 2 - Day 10 Classics
 *
 * Ex 2.2 b) Fibonacci
 * Write a small program with a method that calculates the nth element of the
 * Fibonacci sequence as seen in the notes.
 * Is it easy to do this both iteratively and recursively? Try both ways and see
 * which is more natural for you. If one takes too long, try the other way.
 * When doing it recursively, do it with and without memoization. Compare the
 * time that is needed in each case to find F(40) or F(45).
 *
 * Note for myself
 * The sequence of Fibonacci numbers: where every number is the addition of the
 * preceding two.
 */

// without memoization
public class FibonacciRecursive {

    private int n;

    public int fibonacciRecursive(int n) {
        
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int result = fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
            return result;
        }
    }

    public static void main(String[] args) {
        FibonacciRecursive test = new FibonacciRecursive();
        test.launch();
    }

    public void launch() {
        System.out.println();
        
        long preTime = System.currentTimeMillis();
        System.out.println("The 40th Fibonacci number is: " + fibonacciRecursive(40));
        long postTime = System.currentTimeMillis();
        System.out.println("Time taken to compute the 40th in milliseconds -> " + (postTime - preTime) + "\n");

        preTime = System.currentTimeMillis();
        System.out.println("The 45th Fibonacci number is: " + fibonacciRecursive(45));
        postTime = System.currentTimeMillis();
        System.out.println("Time taken to compute the 45th in milliseconds -> " + (postTime - preTime));
    }
}