public class Launcher {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();

		// Test the calculator
		// System.out.println("3 + 2 = " + calculator.add(3, 2));
		// System.out.println("3 - 2 = " + calculator.subtract(3, 2));
		// System.out.println("3 x 2 = " + calculator.multiply(3, 2));
		// System.out.println("3 / 2 = " + calculator.divide(3, 2));
		// System.out.println("3 % 2 = " + calculator.modulus(3, 2));

		// Ask user for two numbers

		System.out.print("Give me a number: ");
		String aString = System.console().readLine();
		int a = Integer.parseInt(aString);

		System.out.print("Give me another number: ");
		String bString = System.console().readLine();
		int b = Integer.parseInt(bString);
		
		System.out.println();

		// Add
		System.out.println("Adding your two numbers: ");
		System.out.println(a + " + " + b + " = " + calculator.add(a, b));
		System.out.println();

		// Subtract
		System.out.println("Subtracting your two numbers: ");
		System.out.println(a + " - " + b + " = " + calculator.subtract(a, b));
		System.out.println();

		// Multiply
		System.out.println("Multiplying your two numbers: ");
		System.out.println(a + " * " + b + " = " + calculator.multiply(a, b));
		System.out.println();

		// Divide
		System.out.println("Dividing your two numbers: ");
		System.out.println(a + " / " + b + " = " + calculator.divide(a, b));
		System.out.println();

		// Modulus
		System.out.println("Returning the modulus for your two numbers: ");
		System.out.println(a + " % " + b + " = " + calculator.modulus(a, b));
		System.out.println();
	}
}