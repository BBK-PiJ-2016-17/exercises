package arrays;

import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by ginestra on 08/06/2017.
 */
public class Heights {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numStundents;
        double [] heights;

        System.out.println("How many students do you have? ");
        numStundents = in.nextInt();

        heights = new double[numStundents];

        for (int i = 0; i < numStundents; i++) {
            System.out.println("Enter your height: ");
            heights[i] = in.nextDouble();
        }

        double maxHeight = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (maxHeight < heights[i]) maxHeight = heights[i];
        }

        double total = 0;

        for (int i = 0; i < heights.length; i++) {
            total += heights[i];
        }

        System.out.println("The tallest student is: " + maxHeight + " inches " +
                "tall");
        System.out.println("The average height of all students is " + (total
                / numStundents) + " inches");
    }
}
