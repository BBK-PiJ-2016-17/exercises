package threads_01_02;

/**
 * Created by ginestra on 07/06/2017.
 */
public class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName()
                + " a thread created by implementing a Runnable interface!");
    }
}
