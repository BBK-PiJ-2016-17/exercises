/**
 * Exercise 1 - Equality of floating-point numbers
 * Look at the following code. What does it do? What will it print on the screen?
 *
 * double d1 = 1.255
 * double d2 = d1 + 7 - 4 - 3
 * if (d1 == d2) {
 *	println("1.255 is equal to 1.255 plus 7 minus 7");
 * } else {
 *	println("1.255 is NOT equal to 1.255 plus 7 minus 7");
 * }
 *
 * Execute the program. Does it print what you expected it to print? Why?
 * (Hint: print the value of d1 and d2; why do they have these values?).
 * If the program is not behaving correctly, fix it.
 */

public class Equality {
	private double d1 = 1.255;
	private double d2 = d1 + 7 - 4 - 3;

	public void Equality() {
		if (d1 == d2) {
			System.out.println("1.255 is equal to 1.255 plus 7 minus 7");
		} else {
			System.out.println("1.255 is NOT equal to 1.255 plus 7 minus 7");
		}
	}

	public static void main(String[] args) {
		System.out.println(d1);
		System.out.println(d2);	
	}
}