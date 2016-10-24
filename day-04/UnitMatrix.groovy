/**
 * Ex 1 - Scope
 * Look at the following code (with line numbers for clarity) and say where
 * each of the following variables is visible:
 *
 * i, j, newSize, size.
 *
 */

class UnitMatrix {

	// int is visible within the class and to its methods
	int size;

	void setSize(int newSize) {	// "this" is alway compulsory for
								// a setter not in other cases
		// size is local to the setSize() method here
		// and newSize is local to the method too.
 		this.size = newSize;
	}

	void print() {
		for (int i = 0; i < size; i++) {
			// i is only visible within this for loop
			for (int j < 0; j < size; j++) {
				// j is only visible within this for loop
				if (i == j) {
					println("1 ");
				} else {
					println("0 ");
				}
			}
		}
		println("");
	}
}