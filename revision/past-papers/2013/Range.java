import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        int bottom;
        int top;
        int sumInRange = 0;
        int sumOutRange = 0;
        int value;

        Scanner reading = new Scanner(System.in);
        System.out.println("Give me a value for the bottom of the range: ");
        bottom = reading.nextInt();
        System.out.println("Give me a value for the top of the range: ");
        top = reading.nextInt();

        do {
            System.out.println("Give me a number (0 to exit): ");
            value = reading.nextInt();
            if (value < bottom || value > top) {
                sumOutRange += value;
            } else {
                sumInRange += value;
            }
        } while(value != 0);

        System.out.println("sumInRange: " + sumInRange);
        System.out.println(("sumOutRange: " + sumOutRange));
    }
}