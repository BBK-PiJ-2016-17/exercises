/**
 * Exercise 17 - Optimus Prime (*)
 *
 * Write a program that reads an integer number from the user, and then outputs
 * the closest prime number. If there are two prime numbers at the same
 * distance, it should output both. For instance, if the user enters 5116,
 * the output should be 5113 and 5119.
 */

int i;
int num;
int counterPlus;
int counterMinus;
int optimusPrime;

print "Enter a number: ";

num = System.console().readLine();

// while (primeCount < 1000) {
	for (i = 1; i <= num; i++) {

		if (num % i != 0) {
			counter++;
		} else {
			if (num == 2) {
				countEven++;	// Adding an extra count to fix the special case
								// for number "2"
			}
			countEven++;
		}
	}

	if (countEven < 3) {
		println primeCount+1 + ": \t" + num;
		primeCount++;
	}

	counter = 0;
	countEven = 0;

	num++;
// }

println ("\nAnd that's a list of the first 1000 prime numbers.\n");