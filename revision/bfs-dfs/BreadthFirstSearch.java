public class BreadthFirstSearch {
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
}