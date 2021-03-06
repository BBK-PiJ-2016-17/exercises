/**
 * Implementation of interface stack using a 
 * dynamic structure as support. 
 */
public class PointerStringStack implements StringStack {
    /**
     * The head of the stack: the visible node
     */
    private StringStackNode head;

    public PointerStringStack() {
	  head = null;
    }

    public void push(String newText) {
	  StringStackNode newNode = new StringStackNode(newText);
	  if (head != null) {
		newNode.setNext(head);
	  }
	  head = newNode;	  
    }

    public String pop() {
	  if (head == null) {
		return null;
	  }
	  String result = head.getText();
	  head = head.getNext();
	  return result;
    }

    public String peek() {
	  if (head == null) {
		return null;
	  }

	  return head.getText();
    }

    public boolean isEmpty() {
	  if (getSize() == 0) {
		return true;
	  }

	  return false;
    }

    /**
     * Returns the number of string in the stack
     */
    public int getSize() {
	  int result = 0;
	  StringStackNode currentNode = head;
	  while (currentNode != null) {
		currentNode = currentNode.getNext();
		result++;
	  }
	  return result;
    }
}