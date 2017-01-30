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
    private int total;

    public Ex_03a() {
        this.total = total;
    }

    public static void main(String[] args) {
        Ex_03a test = new Ex_03a();
        test.launch();
    }

    public int getNumbers() {
        try {
            System.out.print("Give me a number: ");
            String str = System.console().readLine();
            int latestNum = Integer.parseInt(str);
        } catch (NumberFormatException) {
            System.out.println("This is not a number");
        }
    }

    public void launch() {
        total = 0;

        for (int i = 0; i < 10; i++) {
            int latestNum = getNumbers();
            total =+ total + latestNum;
        }
    }
}
