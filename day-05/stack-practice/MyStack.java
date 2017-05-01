import java.util.Arrays;

public class MyStack {
    private int size;
    private String myArray[];
    private int top = -1;   // The stack is initially empty, therefore nothing
                            // is stored in index 0. I set to -1 to start off.

    public MyStack(int size) {
        this.size = size;
        this.myArray = new String[size];
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
            myArray[top] = null;
            top--;
            return myArray[top];
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

        System.out.println("Size of the stack: " + thisStack.size);

        thisStack.peek();

        System.out.println();

        thisStack.push("First item");
        System.out.print("\t");
        thisStack.peek();
        System.out.println("\tThe top index is: " + thisStack.top);

        System.out.println();
        
        thisStack.push("Second item");
        System.out.print("\t");
        thisStack.peek();
        System.out.println("\tThe top index is: " + thisStack.top);

        System.out.println();

        thisStack.push("Third item");
        System.out.print("\t");
        thisStack.peek();
        System.out.println("\tThe top index is: " + thisStack.top);

        System.out.println();

        thisStack.push("Fourth item");
        System.out.print("\t");
        thisStack.peek();
        System.out.println("\tThe top index is: " + thisStack.top);

        System.out.println();

        thisStack.push("Fifth item");
        System.out.print("\t");
        thisStack.peek();
        System.out.println("\tThe top index is: " + thisStack.top);

        System.out.println();

        thisStack.push("Sixth item");
        System.out.print("\t");
        thisStack.peek();
        System.out.println("\tThe top index is: " + thisStack.top);

        System.out.println();

        thisStack.push("Seventh item");
        System.out.print("\t");
        thisStack.peek();
        System.out.println("\tThe top index is: " + thisStack.top);

        System.out.println();

        thisStack.push("Eighth item");
        System.out.print("\t");
        thisStack.peek();
        System.out.println("\tThe top index is: " + thisStack.top);

        System.out.println();

        thisStack.push("Ninth item");
        System.out.print("\t");
        thisStack.peek();
        System.out.println("\tThe top index is: " + thisStack.top);

        System.out.println();

        thisStack.push("Tenth item");
        System.out.print("\t");
        thisStack.peek();
        System.out.println("\tThe top index is: " + thisStack.top);

        System.out.println();

        // Stack should be full now
        thisStack.push("Tenth item");
        System.out.print("\t");
        thisStack.peek();
        System.out.println("\tThe top index is: " + thisStack.top);

        System.out.println();

        thisStack.pop();

        System.out.print("\t");
        thisStack.peek();


        System.out.println();
        System.out.println("At index 0: " + thisStack.myArray[0]);
        System.out.println("At index 9: " + thisStack.myArray[9]);


    }
}