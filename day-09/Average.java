/**
 * Just testing something from Day-09 notes
 */

public class Average {

    public void printAverage(double d1, double d2) {
        printAverage(d1, d2, "The average is: ");
    }

    public void printAverage(double d1, double d2, String msg) {
        double result = 0.5 * (d1 + d2);
        System.out.println(msg + result);
    }

    public static void main(String[] args) {
        Average av = new Average();
        av.printAverage(3.5, 6.5);

        av.printAverage(4, 7, "This is the result: ");
    }
}