/**
 * Exercise 1 - Day 08
 * Create a class OldPhone that implements the following interface.
 */

public class OldPhone implements Phone {
    private int number;

    public void call(String number) {
        System.out.println("Calling " + number + "...");
    }
}