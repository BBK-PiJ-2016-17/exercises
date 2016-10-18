/**
 * Exercise 5 - Rectangle
 * Write a program that reads the X and Y coordinates of two points and then
 * outputs the area of a rectangle where both points are opposite corners.
 * Use the following class to store the data for the points:
 *	class Rectangle {
 *		Point upLeft;
 *		Point downRight;
 *	}
 * Your program should calculate (and write on the screen) the perimeter and
 * area of the rectangle.
 * Note: For exercises 5, 6, and 7 you must access (i.e. read or write) the
 * value of the coordinates of the points through the rectangle, not directly
 * through the point, i.e. myRectangle.upLeft.x, not point.x or x.
 */

class Point {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}

Rectangle myRectangle = new Rectangle();
myRectangle.upLeft = new Point();
myRectangle.downRight = new Point();

print("Give me the x of the first point: ");
myRectangle.upLeft.x = readDouble();
print("Give me the y of the first point: ");
myRectangle.upLeft.y = readDouble();

print("Give me the x of the second point: ");
myRectangle.downRight.x = readDouble();
print("Give me the y of the second point: ");
myRectangle.downRight.y = readDouble();

double height = myRectangle.upLeft.y - myRectangle.downRight.y;
double width = myRectangle.downRight.x - myRectangle.upLeft.x;

double perimeter = 2 * (width + height);
double area = width * height;

println("The perimeteri is " + perimeter + " and the area is " + area + ".");