/**
 * Day 14 (Swapped with day 15)
 *
 * Ex 1
 * b) McCarthy’s 91 function
 * Calculate the result of calling this method with arguments 50, 73, and 95.
 * Note that the recursion on line 5 is double.
 * (Hint: If you get too confused, maybe writing a slightly modified version of this code
 * that prints the numbers on screen can help).
 *
 */
public class McCarthy {

    // I've added a counter to check the relation between the number 101 and the
    // times that the loop gets executed.
    // It turns out it executes (101 - n) times
    public int counter = 0;

    public static void main(String[] args) {
        McCarthy test = new McCarthy();
        test.launch();
    }

    public void launch() {
        System.out.println("\n=== mcCarthy 50 ===");
        mcCarthy91(50);
        counter = 0;
        System.out.println("\n=== mcCarthy 73 ===");
        mcCarthy91(73);
        counter = 0;
        System.out.println("\n=== mcCarthy 95 ===");
        mcCarthy91(95);
        counter = 0;

        // Corner cases

        System.out.println("\n=== McCarthy 101 ===");
        mcCarthy91(101);
        counter = 0;

        System.out.println("\n=== McCarthy 91 ===");
        mcCarthy91(91);
    }

    public int mcCarthy91(int n) {
        System.out.println("\tLine 29 - n is: " + n);
        if (n > 100) {
            System.out.print("\n> 100: n is " + n + " / We subtract 10 = ");
            System.out.println(n - 10);
            return n - 10;
        }

        // System.out.println("This: " + mcCarthy91(mcCarthy91(n + 11)));

        counter++;
        System.out.println(counter + "\tLine 38 - n is: " + n);
        return mcCarthy91(mcCarthy91(n + 11)); // Double recursion

        // I don't understand why it ends always at 101.
        // (Because it returns 91 - But why 91?)

    }

}
