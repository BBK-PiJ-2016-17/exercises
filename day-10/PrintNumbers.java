/**
 * Ex 1 - Day 10 Recursive code, line by line
 *
 * a) What number would the following method print on screen if you called printNumbers(6)?
 * 
 *  void printNumbers(int n) {
 *      if (n <= 0) {
 *          return;
 *      }
 *
 *      printLine(n);
 *      printNumbers(n-2); // calls itself
 *      printNumbers(n-3); // calls itself
 *      printLine(n);
 *  }
 *
 * 6, 4, 2, 2 
 *
 * Do this exercise on paper. Then add this method to a Java Decaf program and check your answer.
 */

// Creating a class to test it

public class PrintNumbers {
    private int i = 0;
    public void printNumbers(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println(n + " - Round " + i);
        printNumbers(n-2);
        printNumbers(n-3);
        System.out.println(n + " - Round " + i);

        i++;
    }

    public static void main(String[] args) {
        PrintNumbers test = new PrintNumbers();
        test.launch();
    }

    public void launch() {
        printNumbers(6);
    }
}