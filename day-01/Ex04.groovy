/**
 * Exercise 04 - Prime numbers
 *
 * Write a program that asks a number from the user, then says whether the
 * number is prime or not. Remember that a number that is divisible by any
 * number apart from 1 and itself is prime. You can use the modulo operator
 * (if a % b is zero, then a is divisible by b).
 */

print "Pick a prime number: ";
String str = System.console().readLine();
int yourNum = Integer.parseInt(str);

if (yourNum % 2 == 0) {
	println("This is not a prime number... it's an even number. Don't cheat!");
} else {
	i = 2; // I don't need to divide by 1 or zero, so I start at 2
	while (i < yourNum) {
		println ("Dividing " + yourNum + " by " + i);
		if (yourNum % i != 0) {
			i++;
		} else {
			println ("Not a prime number, sorry. Your number can be divided by " + i);
			break;
		}
	}
}

println ("And we're done here.");