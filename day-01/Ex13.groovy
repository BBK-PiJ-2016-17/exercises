/**
 * Exercise 13 - All the primes up to 1,000 (*)
 *
 * Write a program that prints all on screen all prime numbers up to 1,000.
 */

int i;
int num;
int counter;
int countEven;

for (num = 1; num <= 1000; num++) {
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

	if (num == 1000) {
		break;
	}

	if (countEven < 3) {
		println num;
	}

	counter = 0;
	countEven = 0;
}

println ("\nAnd we're done here.\n");