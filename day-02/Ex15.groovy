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