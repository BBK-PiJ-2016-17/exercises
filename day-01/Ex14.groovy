/**
 * Exercise 14 - Up to 1000 primes (*)
 *
 * Modify the program that you wrote for the former exercise
 * so that it writes on screen the first 1,000 primes.
 */

int i;
int num = 1;
int counter;
int countEven;
int primeCount;

while (primeCount < 1000) {
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
}

println ("\nAnd that's a list of the first 1000 prime numbers.\n");