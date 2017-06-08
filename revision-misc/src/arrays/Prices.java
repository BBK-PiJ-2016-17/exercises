package arrays;

import java.util.Scanner;

/**
 * 2D array to represent prices and discounts
 */
public class Prices {
    public static void main(String[] args) {
        double[][] prices = new double[5][2]; // 5 rows, 2 columns
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the original price: ");
            prices[i][0] = in.nextDouble();
            prices[i][1] = prices[i][0] * .70; // 30% discont;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("10\nOriginal price\t\t$ " + prices[i][0] +
                    "\nDiscounted price\t$ " + prices[i][1]);
        }
    }
}
