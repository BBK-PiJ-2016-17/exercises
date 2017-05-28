import java.util.Arrays;

// Experimenting with FIFO queue and Arrays

public class MyQueue {
    private int size;
    private String[] myArray;
    private int front, rear = -1;

    public MyQueue(int size) {
        this.size = size;
        this.myArray = new String[size];
        this.front = front;
        this.rear = rear;
    }

    public void insert(String item) {
        if (front == -1) { // Queue is empty
            front = 0;
            rear = 0;
            myArray[front] = item;
        } else if(front == rear) { // Only one item in the queue
            rear++;
            myArray[rear] = item;
        } else { // Index out of bounds
            System.out.println("The queue is full");
        }
    }

    public String delete() {
        return null;
    }

    public String retrieve(int index) {
        if (front != -1) {
            System.out.println("Item at index " + index + " is: " +
                myArray[index]);
        }

        System.out.println("The queue is empty");
        return null;
    }

    public static void main(String[] args) {
        MyQueue thisQueue = new MyQueue(10);

        System.out.println("This queue size is: " + thisQueue.size);

        thisQueue.insert("First in the queue");
        System.out.println("At index 0: " + thisQueue.retrieve(0));


    }
}