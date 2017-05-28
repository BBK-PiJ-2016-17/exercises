import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Node {
    private Node left;
    private Node right;
    private String label;
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
}