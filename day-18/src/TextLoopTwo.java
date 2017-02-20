/**
 * Day 18 - Ex 1 / Text Loops
 *
 * Look at the following code (comments ommitted for brevity). What will the
 * output be for each of the “thread” and the “no threads” modes?
 *
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

//    private void sleep() {
//        try {
//            Thread.sleep(1000); // Sleep one second
//        } catch (InterruptedException ex) {
//            ex.printStackTrace(); // Nothing to do, sleep a bit less
//        }
//    }

    private void sleep() {
        try {
            System.out.print("Sleeping for a second");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(200);
                System.out.print(".");
            }
            System.out.println("done!");
        } catch (InterruptedException ex) {
            ex.printStackTrace(); // Nothing to do, sleep a bit less
        }
    }
}
