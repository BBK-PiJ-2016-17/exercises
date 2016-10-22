/**
 * Try This 1-1
 * This program converts gallons to liters.
 * Call this program GalToLit.java.
*/

class GalToLit {
	public static void main(String[] args) {
		double gal;
		double lit;

		double constant = 3.7854; // number of liters per gallon

		System.out.print("How many gallons do you have: ");
		String read = System.console().readLine();
		gal = Integer.parseInt(read);

		lit = gal * constant;

		System.out.println("You have " + gal + " gallons.");
		System.out.println("Which means you also have " + lit + " liters.");
	}
}