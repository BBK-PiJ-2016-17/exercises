package threads_01_02;

/**
 * Created by ginestra on 07/06/2017.
 */
public class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName() +
                " created by extending Thread class!");
    }
}
