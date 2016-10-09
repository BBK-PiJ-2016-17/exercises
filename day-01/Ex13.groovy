/**
 * Exercise 13 - All the primes up to 1,000 (*)
 *
 * Write a program that prints all on screen all prime numbers up to 1,000.
 */

int i;
int num;

for (i = 0; i <= 1000; i++) {
	if (num % 2 == 0) {
		println("This is not a prime number... it's an even number. Don't cheat!");
	} else {
		i = 2; // I don't need to divide by 1 or zero, so I start at 2
		while (i < num) {
			println ("Dividing " + num + " by " + i);
			if (num % i != 0) {
				i++;
			} else {
				println ("Not a prime number, sorry. Your number can be divided by " + i);
				break;
			}
		}
	}
}

println ("And we're done here.");