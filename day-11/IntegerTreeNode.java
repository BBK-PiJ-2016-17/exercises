/**
 * Ex 1 - Day 11 / Integer Binary Tree
 *
 * 1.1 First steps: add and seek
 *
 * Complete the class IntegerTreeNode.
 * From the notes, you already know what the member fields are and you have seen
 * a possible implementation of methods add(int) and contains(int). Implement as
 * well two methods getMax() and getMin() that returns the maximum and the
 * minimum values stored in the tree.
 * Compile the class and use it inside a script adding numbers in different
 * orderings.
 */

public class IntegerTreeNode {
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;
    
    // ... methods would be here
    public add(int newNumber) {
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            } else {
                right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }

    public boolean contains(int n) {
        if (n == this.value) {
            return true;
        } else if (n > this.value) {
            if (right == null) {
                return false;
            } else {
                return right.contains(n);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(n);
            }
        }
    }

    public int getMax(int max) {
        return max;
    }

    public int getMin(int min) {
        return min;
    }

    public static void main(String[] args) {
        IntegerTreeNode test = new IntegerTreeNode();
        test.launch();
    }

    public void launch() {

    }
}
