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
 *
 * 1.4 Deletion of elements (*)
 *
 * Add a method remove(int) to the class. This method must look for the node
 * that contains the given value and remove it from the tree.
 * Hint: removing leaves is trivial; to remove nodes, you can replace the removed
 * node with its highest element on its left or the lowest on its right.
 */

public class IntegerTreeNode {
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;

    IntegerTreeNode current;
    IntegerTreeNode parent;
    
    // Constructor
    public IntegerTreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;

        this.current = current;
        this.parent = parent;
    }

    public void add(int newNode) {
        if (newNode == this.value) { // Using == because they're int type
            System.out.println(value + " is a duplicate!");
            return; // Return now, since we don't want duplicates in the tree
        }

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
    @Override
    public String toString() {

        String result = "" + value;

        if (left == null) {
            result += " L[]";
        } else {
            result += " L[" + left.toString() + "]";
        }

        if (right == null) {
            result += " R[]";
        } else {
            result += " R[" + right.toString() + "]";
        }

        return result;
    }

    // 1.3 Adding method depth()
    // depth
    public int depth() {
        int leftDepth = 0;
        if (left != null) {
            leftDepth = left.depth();
        }

        int rightDepth = 0;
        if (right != null) {
            rightDepth = right.depth();
        }

        if (leftDepth > rightDepth) {
            // Adding 1 to count for the root level
            return 1 + leftDepth;
        } else {
            // Adding 1 to count for the root level
            return 1 + rightDepth;
        }
    }

    // 1.4 Adding method remove()
    public void remove(int nodeValue) {
        if (contains(nodeValue)) {
            System.out.println("The element " + nodeValue + " is in the tree");

            // Why am I checking the nulls here, shouldn't they be in the
            // isLeaf() method?
            // IntegerTreeNode current = null;

            // while (left != null && right != null) {
            //     if (left.value == nodeValue) {
            //         current = left;
            //     } else {
            //         left = left.left; // I need recursion
            //     }

            //     if (right.value == nodeValue) {
            //         current = right;
            //     } else {
            //         right = right.right;
            //     }

            //     System.out.println("left.value = " + left.value);
            //     System.out.println("right.value = " + right.value);
            // }
            // check if it's a leaf


        // if (left.value == nodeValue) {
        //     current = left;
        // } else if (right.value == nodeValue) {
        //     current = right;
        // }


            // if (isLeaf(current, nodeValue)) {
            //     System.out.println("hey! it should be a leaf");
            // } else {
            //     System.out.println("maybe not a leaf");
            // }
        } else {
            System.out.println("The element " + nodeValue + " is NOT in the tree.");
        }
    }

    public boolean isLeaf(IntegerTreeNode node, int value) {
        // System.out.println(node.value);

        if (node.value == value) {
            current = node;
            return true;
        } else if (node.left != null) {
            isLeaf(node.left, value);
            return true;
        } else if (node.right != null) {
            isLeaf(node.right, value);
            return true;
        }

        if (node == null) {
            System.out.println("It's null");
            return false;
        }
        if (node.right == null && node.left == null && node.value == value) {
            System.out.println("test");
            return true;
        }

        return false; 
    }

    public static void main(String[] args) {
        IntegerTreeNode root = new IntegerTreeNode(9); // 9 will be the root
        root.launch();
    }

    public void launch() {

        // Once initialised, add more nodes
        add(2);
        add(13);
        add(13);
        add(1);
        add(5);
        add(6);
        add(4);
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

        System.out.println("Tree representation:");
        System.out.println("[" + toString() + "]");

        System.out.println();

        System.out.println("Depth of the tree: " + depth());

        System.out.println();

        remove(17);
        remove(23);
        remove(-1);

        System.out.println(isLeaf(left, 17));

        System.out.println("\nIs it a leaf?");
        System.out.println(isLeaf(parent, -1));
        System.out.println(isLeaf(left, -1));
        System.out.println(isLeaf(right, 24));
        System.out.println(isLeaf(parent, 24));

        System.out.println();

        System.out.println("[" + toString() + "]");

        System.out.println();

        System.out.println("Depth of the tree: " + depth());

    }
}
