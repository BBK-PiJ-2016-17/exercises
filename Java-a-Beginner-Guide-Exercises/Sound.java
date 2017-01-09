/**
 * Try This 2-1
 * Compute the distance to a lightning strike whose sound takes 7.2 seconds to
 * reach you.
*/

public class Sound {
    public static void main(String args[]) {

        System.out.print("\nHow many seconds between the lighting and the thunder? ");
        String str = System.console().readLine();

        double time = Double.parseDouble(str);

        System.out.println("\n==== Distance in feet ====\n");

        double dist = time * 1100; // feet per second
        System.out.println("The lightning is " + dist + " feet away.");

        System.out.println("\n==== Distance in meters ====\n");

        dist = time * 343; // meters per second
        System.out.println("The lightning is " + dist + " meters away.");
    }
}