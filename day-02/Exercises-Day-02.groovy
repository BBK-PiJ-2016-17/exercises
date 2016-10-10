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

/**
 * Exercise 15 - Guess my number (*)
 *
 * Write a program that thinks of a random number between 0 and 1000,
 * and then lets the user try to guess it.
 * For every guess, the computer says whether the guess is correct, or too low,
 * or too high. When the user finds the number, the computer will tell how many
 * guesses were needed. The output could be similar to the following example:
 *
 * Try to guess my number!
 * 
 * Tell me a number: 2
 * No! My number is higher.
 * Tell me a number: 800
 * No! My number is lower.
 * Tell me a number: 500
 * No! My number is lower.
 * Tell me a number: 350
 * No! My number is higher.
 * Tell me a number: 376
 * CORRECT!
 * You needed 5 guesses.
 *
 * (Hint: to get a random number between 0 and 1000, use the following line:)
 *   int numberToGuess = Math.abs(1000 * Math.random())
 */

int numberToGuess = Math.abs(1000 * Math.random());
int counter;
String guess;
int guessNum;

println "\n==== Let's play.\n==== Try to guess my number!\n";

// Print the random number to check whether the matching works.
// println numberToGuess + "\n\n";

print "Tell me a number between 0 and 1000: ";
guess = System.console().readLine();
guessNum = Integer.parseInt(guess);

while (guessNum != numberToGuess) {
	counter++;
	if (guessNum < numberToGuess) {
		print "Nope. Too LOW. Try again: ";
	} else {
		print "Nope. Too HIGH. Try again: ";
	}
	guess = System.console().readLine();
	guessNum = Integer.parseInt(guess);
}

if (guessNum == numberToGuess) {
	println "\nWell done!";
	println "It took you " + counter + " guesses."
}

/**
 * Exercise 16 - Rock, Paper, Scissors (*)
 *
 * Write a program that reads 2 characters from either the keyboard or a file.
 * The characters are either PP, PR, PS, RP, RR, RS, SP, SR, or SS.
 * They correspond to the selections made by 2 players playing the game of
 * rock-paper-scissors.
 *
 * Make the program accept inputs until one player’s score is more than 3 points
 * ahead of the other.
 *
 * Hint: remember that you can use .substring() to get the elements of a String.
 */

int playerOneCounter;
int playerTwoCounter;

String userCombination;

println "==== Let's play Rock, Paper, Scissors! ====";
println "Pick a combination between PP, PR, PS, RP, RR, RS, SP, SR, SS\n";

while (playerOneCounter < 3 && playerTwoCounter < 3) {

	// Read input!
	print "Go on, pick one: ";

	userCombination = System.console().readLine();

	switch (userCombination) {
	 	case "PP":
	 		println "Draw";
	 		break;
	 	case "PR":
	 		println "Player One wins";
	 		playerOneCounter++;
	 		break;
	 	case "PS":
	 		println "Player Two wins";
	 		playerTwoCounter++;
	 		break;
	 	case "RP":
	 		println "Player Two wins";
	 		playerTwoCounter++;
	 		break;
	 	case "RR":
	 		println "Draw";
	 		break;
	 	case "RS":
	 		println "Player One wins";
	 		playerOneCounter++;
	 		break;
	 	case "SP":
	 		println "Player One wins";
	 		playerOneCounter++;
	 		break;
	 	case "SR":
	 		println "Player Two wins";
	 		playerTwoCounter++;
	 		break;
	 	case "SS":
	 		println "Draw";
	 		break;
	 	default:
	 		println "Invalid input";
	 		break;
	}
}

if (playerOneCounter > playerTwoCounter) {
	println "\n === Player One wins! ===\n";
} else {
	println "\n === Player Two wins! ===\n";
}

/**
 * Exercise 17 - Optimus Prime (*)
 *
 * Write a program that reads an integer number from the user, and then outputs
 * the closest prime number. If there are two prime numbers at the same
 * distance, it should output both. For instance, if the user enters 5116,
 * the output should be 5113 and 5119.
 */

 