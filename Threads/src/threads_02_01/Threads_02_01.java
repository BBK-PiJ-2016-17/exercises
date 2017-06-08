/**
 * This program was created to demonstrate a potential problem
 * with using Threads in Java - Race condition
*/

package threads_02_01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Threads_02_01 {
    static double a = 10;
    static double b; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Runnable r1 = () -> {
             if(a == 10)
                 try {
                     // Thread.sleep(0); // Won't delay at all
                     Thread.sleep(500);   // We wait in order to let thread
                                                // B sneak in
                     b = a/2.0;
                     System.out.println(Thread.currentThread().getName() + ": " + b);
                 } catch (InterruptedException e) { }
         };

         Runnable r2 = () -> {
             a = 12;
         };

        Thread thdA = new Thread(r1, "Thread A");
        Thread thdB = new Thread(r2, "Thread B");
        thdA.start();
        thdB.start();
    }
}
