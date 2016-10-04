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