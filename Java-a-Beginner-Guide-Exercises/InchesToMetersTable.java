/**
 * Adapt Try This 1-2 so that it prints a conversion table of inches to meters.
 * Display 12 feet of conversions, inch by inch.
 * Output a blank line every 12 inches.
 * (One meter equals approximately 39.37 inches.)
 */

public class InchesToMetersTable {
    public static void main(String args[]) {
        
        double inches = 1, meters = 0;
        int counter = 0;
        String word;

        System.out.println("\n===========================\n");

        while (meters < 1) {

            meters = (1 / 39.37) * inches; // convert to meters

            if (inches == 1) {
                word = "inch";
            } else {
                word = "inches";
            }

            System.out.println(inches + " " + word + " is " +
            meters + " meters.");
            counter++;

            // every 12 inches, print a blank line
            if(counter == 12) {
                System.out.println();
                counter = 0; // reset the line counter
            }

            inches++;
        }

        System.out.println("\n===========================\n");
    }
}