/**
 * Created by ginestra on 20/02/2017.
 */

public class TextLoopTwo implements Runnable {

    public static final int COUNT = 10;

    private final String name;

    public TextLoopTwo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            // System.out.println("Loop:" + name + ", iteration:" + i + ".");
            sleep();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(1000); // Sleep one second
        } catch (InterruptedException ex) {
            ex.printStackTrace(); // Nothing to do, sleep a bit less
        }
    }
}
