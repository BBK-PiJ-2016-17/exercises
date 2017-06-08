package generics;

import java.util.Date;

public class ComparableExample {

    public static void main(String[] args) {
        // prior to Java 1.5
        // Comparable c = new Date();
        // System.out.println(c.compareTo("Monday")); // the error is caught
        // at runtime

        // Comparable<Date> c2 = new Date();
        // System.out.println(c2.compareTo("Monday")); // the error is caught
        // at compile time
    }
}
