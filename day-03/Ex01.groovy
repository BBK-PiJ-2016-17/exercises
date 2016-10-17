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

double d1 = 1.255;

// After the subtraction the number won't be rounded to .255 and therefore
// d1 != d2
double d2 = d1 + 7 - 4 - 3;

if (d1 == d2) {
	println("1.255 is equal to 1.255 plus 7 minus 7");
} else {
	println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}

// Display difference
println d1;
println d2;

// This should be used instead to check for equality
if (Math.abs(d1 - d2) < 10E-6) {
	println "They are the same (right comparison)";
}
