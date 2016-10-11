/**
 * Exercise 11 - Poker hands (harder)
 *
 * Read five cards from the user.
 * For each card, read the rank (1,2,3,4,5,6,7,8,9,10,J,Q,K)
 * and the suit (”spades”, ”hearts”, ”diamonds”, ”clubs”).
 * Each of the five cards must be valid before accepting the next one.
 * Once the program has the five cards, it should tell the user what is the
 * best hand she has got, as per the following list (from best to worst):
 * 
 * - Straigh flush:
 *   all cards are of the same suite and their ranks are consecutive.
 *   Note that they are probably not ordered as they were entered.
 * 
 * - Poker: four of the five cards have the same rank.
 *
 * - Full House: three of a kind plus two of a kind.
 *
 * - Flush: all cards share the same suit, but are not consecutive.
 *
 * - Straight: all cards are consecutive, but not of the same suit.
 *
 * - Three of a kind: three of the five cards have the same rank.
 *
 * - Two pairs: two pairs (see below).
 *
 * - Pair: two of the five cards have the same rank.
 *
 * - Nothing: any other situation.
 *
 * If you ever launch an online poker business, this could be one (very small)
 * piece of it.
 */

// Using "i" to count the 5 times the user is reading a card
int i;
int j;
int rankPick;
int suitPick;

boolean duplicate = false;

String[] card = ["", "", "", "", ""];
String rank;
String suit;

String[] ranks = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"]
String[] suits = ["spades", "hearts", "diamonds", "clubs"];

int[] rankOrder = [0, 0, 0, 0, 0];
int[] suitOrder = [0, 0, 0, 0, 0];

// println ranks[0..12];

// 5 cards only and they need to be valid
for (i = 0; i < 5; i++) {

	// Check rank
	print ("Read a card value (a number from 1 to 13): ");
	rank = System.console().readLine();
	rankPick = Integer.parseInt(rank);

	switch(rankPick) {
		case 1:	rank = "1";
			break;
		case 2: rank = "2";
			break;
		case 3:	rank = "3";
			break;
		case 4: rank = "4";
			break;
		case 5:	rank = "5";
			break;
		case 6: rank = "6";
			break;
		case 7: rank = "7";
			break;
		case 8: rank = "8";
			break;
		case 9: rank = "9";
			break;
		case 10: rank = "10";
			break;
		case 11: rank = "J";
			break;
		case 12: rank = "Q";
			break;
		case 13: rank = "K";
			break;
		default: rank = "Not a suitable card."
			break;
	}

	while (rank == "Not a suitable card." || rankPick > 13) {
		print ("Read a card value (a number from 1 to 13): ");
		rank = System.console().readLine();
		rankPick = Integer.parseInt(rank);
	}

	// println "Rank " + (i+1)  + ": " + rank;
	card[i] = rank;

	// Check suit
	print ("Pick a card suit (a number from 1 to 4): ");
	suit = System.console().readLine();
	suitPick = Integer.parseInt(suit);

	switch(suitPick) {
		case 1:	suit = "hearts";
			break;
		case 2: suit = "diamonds";
			break;
		case 3:	suit = "clubs";
			break;
		case 4: suit = "spades";
			break;
		default: suit = "Not an existing suit."
			break;
	}

	while (suit == "Not an existing suit." || suitPick > 4) {
		print ("Pick a card suit (a number from 1 to 4): ");
		suit = System.console().readLine();
		suitPick = Integer.parseInt(suit);
	}

	// println "Suit " + (i+1)  + ": " + suit;
	card[i] += " " + suit;

	// Check that the card is not equal to any previous one
	for (j = 0; j < 4; j++) {
		if (card[i] == card[j] && i != 0 && i != j) {
			println "There's a duplicate";
			duplicate = true;
			// println card[0..i];
			break;
		} else {
			duplicate = false;
		}
	}

	if (duplicate == true) {
		i--;	// Using this to make sure we have 5 cards in the end.
				// println "i = " + i;
	} else {
		println "\n==== Card " + (i+1) + " = " + card[i] + " ====\n";
		println "\tRank:\t" + rank;
		println "\tSuit:\t" + suit;

		println "\n\trankPick == " + rankPick;
		rankOrder[i] = rankPick;
		println "\tsuitPick == " + suitPick;
		suitOrder[i] = suitPick;
		println "\n==============================\n"
		duplicate = false;
	}
}

// Printing the 5 users' cards
println card[0..4];

// Print the 5 ranks
println rankOrder[0..4];

// Print the 5 suits
println suitOrder[0..4];