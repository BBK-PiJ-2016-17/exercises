/**
 * Exercise 09 - Going up!
 *
 * Read an arbitrarily long sequence of positive numbers from the user,
 * until -1 is entered. At that point, print ”Yes” if the numbers were
 * consecutive and increasing and ”No” otherwise.
 * Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,10,11,-1” should output ”Yes”,
 * but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”, and ”1,1,2,3,4,5,-1”
 * should output ”No”. 
 */

String status = "Start";
String str;
int counter = 0;
int currentNum;

while (counter != -1) {
	print ("Pick a number (enter \"-1\" to end): ");
	str = System.console().readLine();

	if (str != "-1") {
		int num = Integer.parseInt(str);

		if (status != "No" && counter > 0) {
			if (num == currentNum + 1) {
				status = "Yes";
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

println "Was the sequence consecutive and incrementing? " + status;