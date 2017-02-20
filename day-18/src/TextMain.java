/**
 * Day 18 - Ex 1 / Text Loops
 *
 * Look at the following code (comments ommitted for brevity). What will the
 * output be for each of the “thread” and the “no threads” modes?
 *
 * Compile and execute this code several times. Do you get the result you
 * expected? Run it several times. Do you always get the same result in
 * ’mode 0’? And in mode 1?
 *
 * To run with arguments type: java TextMain 0 (or 1)
 *
 */

public class TextMain {
    private final static int SIZE = 10;

    public static void main(String args[]) {
        if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
            System.out.println("USAGE:  java TextLoopTwo <mode>");
            System.out.println(" mode 0: without threads");
            System.out.println(" mode 1: with threads");
        } else if (args[0].equals("0")) {
            System.out.println("Mode 0 --- without threads");
            for (int i = 0; i < SIZE; i++) {
                Runnable r = new TextLoopTwo("Thread " + i + ".");
                r.run();
            }
        } else {
            System.out.println("Mode 1 --- with threads");
            for (int i = 0; i < SIZE; i++) {
                Runnable r = new TextLoopTwo("Thread " + i + ".");
                Thread t = new Thread(r);
                t.start();
            }
        }
    }
}

