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
    
    // Constructor
    public IntegerTreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    // ... methods would be here
    public void add(int newNumber) {
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

    public int getMax() {
        if (right == null) {
            return this.value;
        } else {
            return right.getMax();
        }
    }

    public int getMin() {
        if (left == null) {
            return this.value;
        } else {
            return left.getMin();
        }
    }

    // depth
    public int getDepth() {
        int leftDepth = 0;
        if (left != null) {
            leftDepth = left.getDepth();
            // could add 1 here and remove it from the return
        }
        int rightDepth = 0;
        if (right != null) {
            rightDepth = right.getDepth();
            // could add 1 here and remove it from the return
        }

        if (leftDepth > rightDepth) {
            return 1 + leftDepth;
        } else {
            return 1 + rightDepth;
        }
    }

    public static void main(String[] args) {
        IntegerTreeNode root = new IntegerTreeNode(9);
        root.launch();
    }

    public void launch() {

        // Once initialised, add more nodes
        add(2);
        add(13);
        add(1);
        add(5);
        add(17);
        add(-1);
        add(1000);
        add(24);

        System.out.println("The smallest element of the tree is: " + getMin());
        System.out.println("The biggest element of the tree is: " + getMax());

        System.out.println("Does the tree contain no. 27? " + contains(27));
        System.out.println("Does the tree contain no. 13? " + contains(13));

        getDepth();

        System.out.println("Depth of the tree: " + getDepth());

    }
}
