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

    public static void main(String[] args) {
        McCarthy test = new McCarthy();
        test.launch();
    }

    public void launch() {
        mcCarthy91(50);
    }

    public int mcCarthy91(int n) {
        if (n > 100) {
            System.out.println(n - 10);
            return n - 10;
        }

        return mcCarthy91(mcCarthy91(n+11));

    }

}
