/**
 * Q6 2015
 */
class Node {
    private char content;
    private Node next;

    public Node(char content, Node next) {
        this.content = content;
        this.next = next;
    }

    public void add(char content) {
        next = new Node(content, getNext());
    }

    char getContent() {
        return content;
    }

    Node getNext() {
        return next;
    }
}
