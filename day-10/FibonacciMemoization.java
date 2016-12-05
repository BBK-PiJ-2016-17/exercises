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

// with memoization
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FibonacciMemoization {

    public static Map<Long, Long> fibMap = new ConcurrentHashMap<>();

    public static long fibonacci(long n) {
        long fibValue = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibMap.containsKey(n)) {
            return fibMap.get(n);
        } else {
            fibValue = fibonacci(n - 1) + fibonacci(n - 2);
            fibMap.put(n, fibValue);
            return fibValue;
        }
    }

    public static void main(String[] args) {
        FibonacciMemoization test = new FibonacciMemoization();
        test.launch();
    }

    public void launch() {
        fibMap.put(0L, 1L);
        fibMap.put(1L, 1L);

        System.out.println();

        long preTime = System.currentTimeMillis();
        System.out.println("Value of 40th number in Fibonacci series -> " + fibonacci(40));
        long postTime = System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds -> " + (postTime - preTime) + "\n");


        preTime = System.currentTimeMillis();
        System.out.println("Value of 45th number in Fibonacci series -> " + fibonacci(45));
        postTime = System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds -> " + (postTime - preTime));
    }
}