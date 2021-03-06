/**
 * Exercise 2 - Calculator
 * Write a program that reads two numbers from the user and then offers
 * a menu with the four basic operations: addition, subtraction, multiplication,
 * and division. Once the user has selected an operation from the menu, the
 * calculator performs the operation.
 *
 * Hint: In the same way that there exists an Integer.parseInt() method to parse
 * integers, there is a Double.parseDouble() method to parse real numbers.
 */

String operation = "";
String phrase = "";
double result;

print ("Give me a number: ");
String num1 = System.console().readLine();
double firstElement = Double.parseDouble(num1);

print ("Give me another number: ");
String num2 = System.console().readLine();
double secondElement = Double.parseDouble(num2);

println ("\tAddition\t1\n\tSubtraction\t2\n\tMultiplication\t3\n\tDivision\t4\n")
print ("Now choose an operation to perform from the above menu: ");
String choice = System.console().readLine();
println ("");

switch (choice) {
	case "1":
		operation = "Addition";
		phrase = ("Lets add " + firstElement + " and " + secondElement);
		result = firstElement + secondElement;
		break;
	case "2":
		operation = "Subtraction";
		phrase = ("Lets subtract " + firstElement + " and " + secondElement);
		result = firstElement - secondElement;
		break;
	case "3":
		operation = "Multiplication";
		phrase = ("Lets multiplicate " + firstElement + " by " + secondElement);
		result = firstElement * secondElement;
		break;
	case "4":
		operation = "Division";
		phrase = ("Lets divide " + firstElement + " by " + secondElement);
		result = firstElement / secondElement;
		break;
	default:
		println ("Please pick an item from the menu (1 to 4)");
		break;
}

println ("\n===== " + operation + " =====\n");
println phrase;
println ("Result: " + result + "\n");