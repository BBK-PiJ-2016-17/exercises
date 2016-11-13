/**
 * Use the Pythagorean theorem to
 * find the length of the hypotenuse
 * given the lengths of the two opposing
 * sides.
*/

public class Hypot {
    public static void main(String args[]) {
        double x, y, z;

        System.out.println();

        System.out.println("What's the lenght of side 1 of your triangle?");
        String xString = System.console().readLine();
        x = Integer.parseInt(xString);

        System.out.println("What's the lenght of side 2 of your triangle?");
        String yString = System.console().readLine();
        y = Integer.parseInt(yString);

        System.out.println();

        z = Math.sqrt(x*x + y*y);
        System.out.println("Hypotenuse is " + z);

        System.out.println();
    }
}