/**
 * Exercise 08 - Maximising
 *
 * Write a program that read a (arbitrarily long) sequence of positive numbers.
 * The sequence is ended when the users enters “-1”.
 * At that point, the program must output the highest number in the sequence.
 */

int num = 0;
int max = 0;

while (num != -1) {
	print ("Pick a number (enter \"-1\" to end): ");
	String str = System.console().readLine();
	num = Integer.parseInt(str);

	if (num > max) {
		max = num;
	}
}

println ("The highest number you entered is: " + max);