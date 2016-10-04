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