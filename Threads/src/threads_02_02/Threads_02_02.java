/**
 * This program is used to demonstrate using synchronization with threads
 */

package threads_02_02;

public class Threads_02_02 {

    //define a class variable called counter
     static int counter = 1;

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        //use lambda notation for the runnable method 
        Runnable r = () -> {
            System.out.println("ID value: " + getID());
        };

        Thread one = new Thread(r,"one");
        one.start();
        Thread two = new Thread(r,"two");
        two.start();

        // When it prints the same ID number, it shows that the threads are
        // not synchronised and a race condition happens.
    }

    public static int getID() {
        return counter++;
    }  
}
