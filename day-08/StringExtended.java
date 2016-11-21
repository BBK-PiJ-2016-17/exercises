/**
 * Ex 7 - Day 08 - Final means no change
 * Create a class that extends String and adds a method printEven() that prints
 * on screen the even-numbered characters of the string. Try to compile it and
 * see what happens.
 *
 * ANSWER:
 * "cannot inherit from final String"
 * So I cannot extend String.
 * If I remove "extends String" I can use the class normally, not inheriting.
 */

// public class StringExtended extends String {
public class StringExtended {
    public void printEven(String input) {
        // Print even-numbered chars of the string
        int inputLength = input.length();

        if (inputLength % 2 == 0) {
            System.out.println(input + " has an even number of chars.");
        } else {
            System.out.println(input + " has an odd number of chars.");
        }
    }

    public static void main(String[] args) {
        StringExtended test = new StringExtended();
        test.printEven("ciao");
        test.printEven("arrivederci");
    }
}