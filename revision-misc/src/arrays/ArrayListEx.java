package arrays;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by ginestra on 08/06/2017.
 */
public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<Property> myArrayList = new ArrayList<>(); // no need to
                                            // provide the size of the array
        Property p1 = new Property(1000, "Land", 3.5);
        myArrayList.add(p1);

        p1 = new Property(230000, "Estate", 2.0, 2, 3);

        myArrayList.add(p1);

        System.out.println("Before: " + myArrayList.toString());

        myArrayList.remove(1);

        System.out.println("\nAfter: " + myArrayList.toString());


    }
}
