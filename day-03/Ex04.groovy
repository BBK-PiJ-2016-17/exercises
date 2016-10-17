/**
 * Exercise 4 - Distance point-to-point
 *
 * Write a program that reads the X and Y coordinates of three points and then
 * outputs which of the three are closer.
 * Use the following class to store the data for the points:
 *
 * class Point {
 *	double x;
 *	double y;
 * }
 *
 * Hint: The distance from (x1, y1) to (x2, y2) can be calculated as
 * square root of: (x1 − x2)to the power of 2 + (y1 − y2) to the power of 2
 */

println ("\n====== POINT 1 ======");

print ("Position x1: ");
String ex1 = System.console().readLine();
double x1 = Double.parseDouble(ex1);

print ("Position y1: ");
String why1 = System.console().readLine();
double y1 = Double.parseDouble(why1)


println ("\n====== POINT 2 ======");

print ("Position x2: ");
String ex2 = System.console().readLine();
double x2 = Double.parseDouble(ex2);

print ("Position y2: ");
String why2 = System.console().readLine();
double y2 = Double.parseDouble(why2)


println ("\n====== POINT 3 ======");

print ("Position x3: ");
String ex3 = System.console().readLine();
double x3 = Double.parseDouble(ex3);

print ("Position y3: ");
String why3 = System.console().readLine();
double y3 = Double.parseDouble(why3)

// Check distance between point 1 and point 2
double squarex1 = Math.pow(2, (x1 - x2));
double squarey1 = Math.pow(2, (y1 - y2));

double distance1 = Math.sqrt(squarex1 + squarey1);

// Check distance between point 2 and point 3
double squarex2 = Math.pow(2, (x2 - x3));
double squarey2 = Math.pow(2, (y2 - y3));

double distance2 = Math.sqrt(squarex2 + squarey2);

// Check distance between point 1 and point 3
double squarex3 = Math.pow(2, (x1 - x3));
double squarey3 = Math.pow(2, (y1 - y3));

double distance3 = Math.sqrt(squarex3 + squarey3);

println "\nDistance from point 1 to point 2: " + distance1;
println "Distance from point 2 to point 3: " + distance2;
println "Distance from point 1 to point 3: " + distance3;
