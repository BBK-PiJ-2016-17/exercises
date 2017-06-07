package Lambdas_01;

/**
 * Created by ginestra on 07/06/2017.
 */
public class Lambdas_01_04 {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // Example of passing multiple values to a method using lambda
        // Notice that I do NOT have to specify the data type of a and b

        Calculate add = (a, b) -> a + b;
        Calculate difference = (a, b) -> Math.abs(a - b);
        Calculate divide = (a, b) -> (b != 0 ? a/b : 0);

        System.out.println(add.calc(3, 2));
        System.out.println(difference.calc(5, 10));
        System.out.println(divide.calc(12, 3));
    }
}
