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