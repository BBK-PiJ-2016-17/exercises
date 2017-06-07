/**
 * Q1 2015
 * What does the following Java program print if executed with 63 as its
 * argument? What is the function that it computes? Explain your answer.
 */
public class Thing {
    public static void main(String[] args) {
        // int n = Integer.parseInt(args[0]);
        int n = Integer.parseInt("63");
        unknown(2, n);
        System.out.println();
    }

    public static void unknown(int a, int b) {
        if (a <= b) {
            if (b % a == 0) {
                System.out.println(" " + a);
                unknown(a, b / a);
            } else {
                a = a + 1;
                unknown(a, b);
            }
        }
    }
}
