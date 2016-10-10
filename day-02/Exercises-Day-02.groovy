/**
 * Exercise 12 - Number piramids
 *
 * Write a program that output a number piramid like the one below.
 *
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 666666
 * 7777777
 * \ldots
 *
 */

int i;
int j;

for (i = 0; i < 8; i++) {
	// print i;

	for (j = 0; j < i; j++) {
		print i;
	}

	println "";
}

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

println ("\nAnd that's a list of all the prime numbers between 1 and a 1000.\n");

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