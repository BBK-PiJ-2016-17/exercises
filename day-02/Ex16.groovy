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