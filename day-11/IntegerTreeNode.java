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
 *
 * 1.2 Tree traversal
 *
 * Add a method toString() to the class. This methods must return a
 * representation of your tree in String form, where every node is represented
 * as a list in square brackets containing its value, the left branch, and the
 * right branch; the left branch should be prefixed by “L” and the right branch
 * by R, and an empty branch should be shown as an empty pair of square
 * brackets. Some examples of outputs in Figure 1.
 * After you have commited this version of toString(), make another version that
 * returns a simplified representation, where every node is represented as a
 * list in square brackets containing its value and its branches, but only if
 * they are not empty; without using the “L” and “R” prefixes. Some examples of
 * outputs in Figure 1.
 * Check that both versions of the method work by adding several elements and
 * printing the String representation of the tree.
 *
 * 1.3 Depth
 *
 * Add a method depth() that returns the number of levels in a tree. By
 * convention, a tree with only one node (i.e. the root) has a depth of zero.
 * Hint: the depths of the trees in Figure 1 are 0, 1, 2, and 3.
 * Hint: the depth of a tree is one more than the deepest of its subtreees.
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
    public void add(int newNode) {
        if (newNode > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNode);
            } else {
                right.add(newNode);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(newNode);
            } else {
                left.add(newNode);
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

    // 1.1 Adding methods getMax() and getMin()
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

    // 1.2 Adding method toString()
    // How do I move to the next if it's not null?
    // A - I re-assign the node I just visited as it was the new root
    @Override
    public String toString() {
        System.out.print("[" + value);
        while (left != null) {
            System.out.print(" L[" + left.value);
            if (left.right != null) {
                System.out.print(" R[" + left.right.value);
                // left.right = left.right;
            }
            left = left.left;
            System.out.print("]");
        }

        while (right != null) {
            System.out.print(" R[" + right.value);
            if (right.left != null) {
                System.out.print(" R[" + right.left.value);
                // right.left = right.left;
            }
            right = right.right;
            System.out.print("]");
        }

        System.out.println("]");

        String tree = null;
        return tree;
    }

    // 1.3 Adding method depth()
    // depth
    public int depth() {
        int leftDepth = 0;
        if (left != null) {
            leftDepth = left.depth();
            // could add 1 here and remove it from the return
        }
        int rightDepth = 0;
        if (right != null) {
            rightDepth = right.depth();
            // could add 1 here and remove it from the return
        }

        if (leftDepth > rightDepth) {
            return 1 + leftDepth;
        } else {
            return 1 + rightDepth;
        }
    }

    public static void main(String[] args) {
        IntegerTreeNode root = new IntegerTreeNode(9); // 9 will be the root
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

        System.out.println();

        System.out.println("The smallest element of the tree is: " + getMin());
        System.out.println("The biggest element of the tree is: " + getMax());

        System.out.println();

        System.out.println("Does the tree contain no. 27? " + contains(27));
        System.out.println("Does the tree contain no. 13? " + contains(13));

        System.out.println();

        toString();

        System.out.println();

        System.out.println("Depth of the tree: " + depth());

    }
}
