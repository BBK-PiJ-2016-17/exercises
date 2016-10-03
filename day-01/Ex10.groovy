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