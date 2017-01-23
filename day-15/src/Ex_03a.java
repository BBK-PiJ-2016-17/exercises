/**
 * Day 15 (Actual Day 14 - Swapped subjects with Day 14)
 *
 * Ex 3a - Error handling on user input
 *
 * Write a program that reads 10 numbers from the user and then prints the mean average. If the user inputs something
 * that is not a number, the program should complain and ask for a number again until 10 numbers have been introduced.
 *
 */

public class Ex_03a {


    public static void main(String[] args) {
        Ex_03a test = new Ex_03a();
        test.launch();
    }

    public void launch() {

        try {

            for (int i = 0; i < 10; i++) {
                System.out.print("Give me a number: ");

                String str = System.console().readLine();
                int input = Integer.parseInt(str);
            }


        } catch (NumberFormatException ex) {

            System.out.println("This is not a number.");
            // Reduce counter
            // go back to asking number
            // Although it's a catch... so it's going to exit the program

        }

    }
}
