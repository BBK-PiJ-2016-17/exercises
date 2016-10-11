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
int primeCount;
int counter;
int countEven;

print "Enter a number: ";

num = System.console().readLine();

primeCount = num;

while (primeCount <= num && primeCount > 0) {
	for (i = num; i > 0; i--) {

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
		break;
	} else {
		primeCount--;
	}

	counter = 0;
	countEven = 0;
}

println (num + " <- this is the closest prime number going down");