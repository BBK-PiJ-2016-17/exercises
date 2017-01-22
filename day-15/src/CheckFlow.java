/**
 * Day 15 (Actual day 14 - Swapped subjects)
 *
 * Ex 01
 *
 * Look at the following code and write the code flow (use the line numbers to indicate which lines are executed in
 * which order) in the following situations:
 *
 * • userInput is 0. // The element @ index 0 is removed on line 33, when executing line 34, we jump to catch on line 47
 * • userInput is 2. // Remove element @ index 0 (line 33), print 4 5 6, Error IndexOutOfBoundException line 47
 * • userInput is 4. // Remove element @ index 0 (line 33), print 6, Error IndexOutOfBoundException line 47
 * • userInput is 6. // Jump straight to line 47 Error IndexOutOfBoundException
 */

import java.util.ArrayList;
import java.util.List;

public class CheckFlow {
    public static void main(String[] args) {
        CheckFlow test = new CheckFlow();
        test.launch(2);
    }

    public void launch(int userInput) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        try {
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}
