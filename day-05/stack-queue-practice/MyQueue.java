import java.util.Arrays;

// Experimenting with FIFO queue and Arrays

public class MyQueue {
    private int size;
    private String[] myArray;
    private int front, rear = null;

    public MyQueue(int size) {
        this.size = size;
        this.myArray = myArray;
        this.front = front;
        this.rear = rear;
    }

    public void insert(String item) {
        if (front == null) { // Queue is empty
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
}