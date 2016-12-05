/**
 * 5 Power
 *
 * Create a class with a method pow that takes two integers (base and exponent)
 * and calculates the power, e.g. pow(2,3) calculates 2 to the power of 3.
 * Is it easy to do this both iteratively and recursively?
*/

// Recursive way
public class PowerRecursive {

    private int base;
    private int exponent;
    private int result;

    public int pow(int base, int exponent) {
        result = base;

        if (exponent > 1) {
            pow(result, exponent - 1);
            result = result * base;
        }

        return result;
    }

    public static void main(String[] args) {
        PowerRecursive test = new PowerRecursive();
        test.launch();
    }

    public void launch() {
        System.out.println("2 to the power of 3 is: " + pow(2,3));
        System.out.println("5 to the power of 2 is: " + pow(5,2));
        System.out.println("12 to the power of 3 is: " + pow(12,3));
        System.out.println("1024 to the power of 2 is: " + pow(1024,2));
        System.out.println("4 to the power of 4 is: " + pow(4,4));
    }
}