// import com.sun.istack.internal.NotNull;
// import com.sun.istack.internal.Nullable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Niklas Wünsche
 */

public class SearchWithStreams {

    public static void main(String[] args) {
        Node root = Node.createTree();

        System.out.println("Nodes by DFS: ".concat(root.searchByDepth().toString()));
        System.out.println("Nodes by BFS: ".concat(root.searchByBreadth().toString()));
    }

}

class Node {

    private Node left;
    private Node right;
    private String label;

    // public Node(@NotNull String label, @Nullable Node left, @Nullable Node right) {
    public Node(String label, Node left, Node right) {
        this.left = left;
        this.right = right;
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

    public List<Node> getChildren() {
        return Stream.of(left, right)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    // Depth First Search - Preorder traversal (root, left, right)
    public List<Node> searchByDepth() {
        List<Node> visitedNodes = new LinkedList<>();
        List<Node> unvisitedNodes = new LinkedList<>();
        unvisitedNodes.add(this);

        while(!unvisitedNodes.isEmpty()) {
            Node currNode = unvisitedNodes.remove(0);

            List<Node> newNodes = currNode.getChildren()
                    .stream()
                    .filter(node -> !visitedNodes.contains(node))
                    .collect(Collectors.toList());

            unvisitedNodes.addAll(0, newNodes);
            visitedNodes.add(currNode);
        }

        return visitedNodes;
    }

    public List<Node> searchByBreadth() {
        List<Node> visitedNodes = new LinkedList<>();
        List<Node> unvisitedNodes = Arrays.asList(this);

        while(!unvisitedNodes.isEmpty()) {
            List<Node> newNodes = unvisitedNodes
                    .stream()
                    .map(Node::getChildren)
                    .flatMap(List::stream)
                    .filter(node -> !visitedNodes.contains(node))
                    .collect(Collectors.toList());

            visitedNodes.addAll(unvisitedNodes);
            unvisitedNodes = newNodes;
        }

        return visitedNodes;
    }

    public static Node createTree() {
        Node twentyFour = new Node("24", null, null);
        Node twelve = new Node("12", null, twentyFour);
        Node thirtyThree = new Node("33", twelve, null);
        Node three = new Node("3", null, null);
        Node five = new Node("5", null, null);
        Node four = new Node("4", three, five);
        Node MCMLXXIX = new Node("1979", null, null);
        Node twoHundredOne = new Node("201", null, MCMLXXIX);
        Node ninetyNine = new Node("99", null, twoHundredOne);
        Node seven = new Node("7", four, thirtyThree);
        return new Node("50", seven, ninetyNine);


        // Node right = new Node("right", null, null);
        // Node childOfLeft = new Node("child of left", null, null);
        // Node left = new Node("left", childOfLeft, null);
        // return new Node("root", left, right);
    }

}