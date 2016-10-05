/**
 * Exercise 02 - Ende homage
 *
 * Is there anything wrong with the following piece of code (hint: yes)?
 * What does it do?
 */

int i = 10 // Semi-colon missing (allowed in Groovy)

// will never run... because 10 is > than 5
while (i < 5) {
	i++;
	println i // Missing semi-colon (allowed in Groovy)
}

println("Got here already. Nothing from the while loop.")