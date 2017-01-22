/**
 * Day 15 (Actual Day 14 - Swapped subjects with Day 14)
 *
 * Ex 2 - Exception
 *
 * Read the following code and check whether there is anything wrong with it. Then write some similar code and check
 * your answer.
 *
 * // Some code here
 * try {
 *      // more code here
 *      list.add(newElement);
 *      // more code here
 * } catch (Exception ex) {
 *      ex.printStackTrace();
 * } catch (NullPointerException ex) {
 *      ex.printStackTrace();
 * }
 *
 * Exception in line 14 is too generic and NullPointerException on line 16 will be caught by it already.
 * It's not good because it removes specificity, in case we need more catches for different Exceptions.
 */

import java.util.ArrayList;
import java.util.List;

public class Ex_02 {
    public static void main(String[] args) {
        Ex_02 test = new Ex_02();
        test.launch();
    }

    public void launch() {

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");

        try {
            list.add("Seven");
        } catch (Exception ex) {
            System.out.println("Error Exception"); // Too generic, NullPointerException below will be ignore, because
                                                    // this catches it already.
                                                    // It removes specificity, not good.
        } catch (NullPointerException ex) {
            System.out.println("Error: NullPointerException");
        }

    }
}
