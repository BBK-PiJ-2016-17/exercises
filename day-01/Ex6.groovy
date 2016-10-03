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
