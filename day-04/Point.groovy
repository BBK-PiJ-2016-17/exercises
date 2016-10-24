/**
 * Ex 2a - Pointer, arrows...
 */
class Point {
	int x;
	int y;

	// This method increments the int by 1 and
	// moves the point to the right

	void increment(Point point, int n) {
		n = n + 1;
		point.x = point.x + 1;
		point = null;
		println("\tAt the end of the methog...");
		println("\tThe integer is " + n);
		println("\tThe point is " + point);
	}

	static void main(String[] args) {
		// Program execution starts here

		Point myPoint = new Point();
		myPoint.x = 0;
		myPoint.y = 0;
		int myInt = 0;

		println("The integer is now " + myInt);
		println("The point is now " + myPoint.x + ", " + myPoint.y);
		println("Calling the method increment(Point, int)...");

		incrementPoint(myPoint, myInt);
		println("The integer is now " + myInt);
		println("The point is now " + myPoint.x + ", " + myPoint.y);
	}
}
