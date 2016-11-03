/**
 * The moon’s gravity is about 17% (it's actually 16.5% - Gi) that of earth’s.
 * Write a program that computes your effective weight on the moon.
 *
 */

public class WeightOnTheMoon {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("What's your weight on planet Earth? ");
        String yourEarthWeightString = System.console().readLine();
        double yourEarthWeight = Double.parseDouble(yourEarthWeightString);

        // Now convert the weight to the Moon's gravity
        double yourMoonWeight = yourEarthWeight * 16.5 / 100;

        System.out.println();
        System.out.println("Your Earth weight: " + yourEarthWeight + "kg");
        System.out.println("And your Moon weight: " + yourMoonWeight + " Moon's kg");
    }
}