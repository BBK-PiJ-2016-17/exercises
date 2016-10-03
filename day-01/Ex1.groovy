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