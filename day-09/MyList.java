import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyList {
    public static void main(String args[]) {
        String[] array = {"Phil", "Mary", "Betty", "bob"};
        List<String> myList = Arrays.asList(array);
        Collections.sort(myList);
        System.out.println("Sorted: " + myList);
        int where = Collections.binarySearch(myList, "Betty");
        System.out.println("Betty is at " + where);
        Collections.shuffle(myList);
        System.out.println("Shuffled: " + myList);
        Collections.shuffle(myList);
        System.out.println("Shuffled: " + myList);
        printAll(myList);
    }

    public static void printAll(List<?> lst) {
        System.out.print("[ ");
        for (Object o : lst)
            System.out.print(o + " ");
            System.out.println("]");
    }
}