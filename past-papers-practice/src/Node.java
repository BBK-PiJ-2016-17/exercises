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
        // Check this method:
        // It puts the newest element in front (stack style)
        System.out.println("Content: " + content);
        next = new Node(content, getNext());
        System.out.println("Next: " + next.getContent());
    }

    char getContent() {
        return content;
    }

    Node getNext() {
        return next;
    }
}
