/**
 * Exercises Day 01 - PiJ 2016-17
 */

/**
 * Exercise 01 - Ternary operator
 *
 * Read the following code and, without executing it first,
 * explain what it does.
 */

// Declare and initiate the "currentYear" var - it's of type int
int currentYear = 2012

// Display the line "When were you born (year)?" in the terminal
print "When were you born (year)? "

// Read the user's answer and record it in the var "str"
String str = System.console().readLine();

// Declare and initiate the "birthYear" var - it's of type int
// although the input was a String. It gets parsed and converted
int birthYear = Integer.parseInt(str);

// Declare and initiate the "ageAprox" var,
// calculating it's value using "currentYear" and "birthYear"
int ageAprox = currentYear - birthYear;

// Declare and initiate the "result" var, of the type String
// If "ageAprox" is more than 17 the string is empty
// otherwise is "not"
String result = (ageAprox > 17) ? "" : "not "

// Prints the line to say whether or not the user is an adult or not
println "It seems you are " + result + "an adult."

/**
 * Exercise 02 - Ende homage
 *
 * Is there anything wrong with the following piece of code (hint: yes)?
 * What does it do?
 */

int i = 10 // Semi-colon missing (allowed in Groovy)

// will never run... because 10 is > than 5
while (i < 5) {
	i++;
	println i // Missing semi-colon (allowed in Groovy)
}

println("Got here already. Nothing from the while loop.")

/**
 * Exercise 03 - Yet another loop
 *
 * What does the following piece of code do?
 */

// Gets the user's input from the console and stores it in
// a var "str" of type String
String str = System.console().readLine()

// Parse the String "str", convert it to an int and store it in "i"
int i = Integer.parseInt(str)

// While "i" is less than 10, increment it by 1,
// ask for another input from the user
// Parse it as an int and store it in "j"
// If j is 0, exit the while loop.
// If j is also not 1, then print j
while (i < 10) {
	i++;
	String str2 = System.console().readLine()
	int j = Integer.parseInt(str2)
	if (j == 0) {
		break;
	} else if (j != 1) {
		println("Round " + i + ": " + j);
	}
}

// Print "finished" in the console once "i" has reached the value of 10
System.out.println("finished");

/**
 * Exercise 04 - Prime numbers
 *
 * Write a program that asks a number from the user, then says whether the
 * number is prime or not. Remember that a number that is divisible by any
 * number apart from 1 and itself is prime. You can use the modulo operator
 * (if a % b is zero, then a is divisible by b).
 */

print "Pick a prime number: ";
String str = System.console().readLine();
int yourNum = Integer.parseInt(str);

if (yourNum % 2 == 0) {
	println("This is not a prime number... it's an even number. Don't cheat!");
} else {
	i = 2; // I don't need to divide by 1 or zero, so I start at 2
	while (i < yourNum) {
		println ("Dividing " + yourNum + " by " + i);
		if (yourNum % i != 0) {
			i++;
		} else {
			println ("Not a prime number, sorry. Your number can be divided by " + i);
			break;
		}
	}
}

println ("And we're done here.");

/**
 * Exercise 05 - Multiplication
 *
 * Write a program that requests two numbers from the user
 * and then outputs its product. You cannot use the “*” operator.
 */

print ("Pick a number: ");
String str1 = System.console().readLine();
int int1 = Integer.parseInt(str1);

print ("Pick another number: ");
String str2 = System.console().readLine();
int int2 = Integer.parseInt(str2);

// Get the multiplication result without using the "*"" operator
// Add the first number up as many times as the second number

int result = 0;
for (i = 0; i < int2; i++) {
	result = result + int1;
}

println (int1 + " * " + int2 + " = " + result);

/**
 * Exercise 06 - Division
 *
 * Write a program that requests two numbers from the user
 * and then outputs the quotient and the remainder,
 * e.g. if the user enters 7 and 3, your program should ouput
 * something like “7 divided by 3 is 2, remainder 1”.
 * You cannot use the “/” or “%” operators.
 */

print ("Pick a number: ");
String str1 = System.console().readLine();
int int1 = Integer.parseInt(str1);

print ("Pick another number: ");
String str2 = System.console().readLine();
int int2 = Integer.parseInt(str2);

int result = int1;

int firstNum = int1;

int counter = 0;

while (result >= int2) {
	result = int1 - int2;
	int1 = result;
	counter++;
}

println (firstNum + " / " + int2 + " is " + counter);
println ("And the reminder is " + result + ".");

/**
 * Exercise 07 - Naive sorting
 *
 * Write a program that reads three numbers and prints them in order,
 * from lowest to highest.
 */

print ("Pick a number: ");
String str1 = System.console().readLine();
int int1 = Integer.parseInt(str1);

print ("Pick another number: ");
String str2 = System.console().readLine();
int int2 = Integer.parseInt(str2);

print ("And another number: ");
String str3 = System.console().readLine();
int int3 = Integer.parseInt(str3);

if (int1 > int2) {
	if (int2 > int3) {
		println (int3 + ", " + int2 + ", " + int1);
	} else if (int1 > int3) {
		println (int2 + ", " + int3 + ", " + int1); 
	} else {
		println (int2 + ", " + int1 + ", " + int3);
	}
} else if (int1 > int3) {
	println (int3 + ", " + int1 + ", " + int2);
} else if (int2 > int3) {
	println (int1 + ", " + int3 + ", " + int2);
} else {
	println (int1 + ", " + int2 + ", " + int3);
}

/**
 * Exercise 08 - Maximising
 *
 * Write a program that read a (arbitrarily long) sequence of positive numbers.
 * The sequence is ended when the users enters “-1”.
 * At that point, the program must output the highest number in the sequence.
 */

int num = 0;
int max = 0;

while (num != -1) {
	print ("Pick a number (enter \"-1\" to end): ");
	String str = System.console().readLine();
	num = Integer.parseInt(str);

	if (num > max) {
		max = num;
	}
}

println ("The highest number you entered is: " + max);

/**
 * Exercise 09 - Going up!
 *
 * Read an arbitrarily long sequence of positive numbers from the user,
 * until -1 is entered. At that point, print ”Yes” if the numbers were
 * consecutive and increasing and ”No” otherwise.
 * Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,10,11,-1” should output ”Yes”,
 * but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”, and ”1,1,2,3,4,5,-1”
 * should output ”No”. 
 */

String status = "Start";
String str;
int counter = 0;
int currentNum;

while (counter != -1) {
	print ("Pick a number (enter \"-1\" to end): ");
	str = System.console().readLine();

	if (str != "-1") {
		int num = Integer.parseInt(str);

		if (status != "No" && counter > 0) {
			if (num == currentNum + 1) {
				status = "Yes";
			} else {
				status = "No";
			}
		}

		currentNum = num;

		counter++;
	} else {
		counter = Integer.parseInt(str);
	}
}

println "Was the sequence consecutive and incrementing? " + status;

/**
 * Exercise 10 - You said high, I said low...
 *
 * Modify your former program so that it outputs ”Yes” when the numbers are
 * consecutive, regardless of whether they go up or down.
 * For example, both ”2,3,4,5,6,-1” and ”10,9,8,7,-1” should now result in ”Yes”.
 */

String status = "Start";
String direction;
int num = 0;
int counter = 0;
int currentNum;

while (counter != -1) {
	print ("Pick a number (enter \"-1\" to end): ");
	str = System.console().readLine();

	if (str != "-1") {
		num = Integer.parseInt(str);

		if (status != "No" && counter > 0) {
			if (direction != "Down" && num == currentNum + 1) {
				status = "Yes, it's going up";
				direction = "Up";
				println num + " - " + status;
			} else if (direction != "Up" && num == currentNum - 1) {
				status = "Yes, it's going down";
				direction = "Down";
				println num + " - " + status;
			} else {
				status = "No";
			}
		}

		currentNum = num;

		counter++;
	} else {
		counter = Integer.parseInt(str);
	}
}

println "Was the sequence consecutive (increaseing or decreasing)? " + status;

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

// I'm using "i" to count the 5 times the user is reading a card
int i;
int j;

String card;
String rank;
String suit;

String[] ranks = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"]
String[] suits = ["spades", "hearts", "diamonds", "clubs"];

// 5 cards only and they need to be valid
for (i = 0; i < 5; i++) {

	// Check rank
	print ("Read a card value: ");
	rank = System.console().readLine();

	for (j = 0; j < 13; j++) {
		if (rank == ranks[j]) {
			// The card has a suitable rank
			// How do I dynamically change the name of the var?
			String rank[i] = rank;
		}
	}

	// Check suit
	print ("Read a card suit: ");
	suit = System.console().readLine();

	// If requirements satisfied
	// Save card (name convention)
	card = 

	i++;
}

// Parse the five cards and check the order

// Parse the five cards and check if the suit matches

// Create an array of cards and for loop

// String[] arrayOfRanks = [rank1, rank2, rank3, rank4, rank5];

// String[] arrayOfSuits = [suit1, suit2, suit3, suit4, suit5];

// I need to combine rank and suit

// use i and j instead of other vars

// TO FINISH

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

println ("\nAnd we're done here.\n");