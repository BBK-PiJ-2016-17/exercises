import java.util.Arrays;

public class MyStack {
    private int size;
    private String myArray[];
    private int top;

    public MyStack(int size) {
        this.size = size;
        this.myArray = new String[size];
        this.top = top;
    }

    public void push(String item) {
        if (top + 1 < size) {
            top++;
            myArray[top] = item;
            System.out.println("Added \"" + item + "\" to the stack.");
        } else {
            System.out.println("Stack is full");
        }
    }

    public String pop() {
        if (top >= 0) {
            System.out.println("Removing one item from the stack: \"" + myArray[top] + "\"");
            return myArray[top--];
        }
        
        System.out.println("Pop Stack is empty");

        return null;
    }

    public String peek() {
        if (top >= 0) {
            System.out.println("At the top of the stack: " + myArray[top]);
            return myArray[top];
        }

        System.out.println("Stack is empty");

        return null;
    }

    public static void main(String[] args) {

        MyStack thisStack = new MyStack(10);

        System.out.println(thisStack.size);

        thisStack.peek();

        thisStack.push("First item");
        thisStack.peek();
        thisStack.push("Second item");
        thisStack.peek();
        thisStack.push("Third item");

        thisStack.peek();

        thisStack.pop();

        thisStack.peek();


    }
}