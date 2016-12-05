/**
 * Ex 1 - Day 10 Recursive code, line by line
 *
 * b) Do you see anything wrong with the following code? How would you fix it?
 * 
 * String buggyMethod(int n) {
 *     if (n == 0) {
 *         return "";
 *     }
 *     return n + " " + buggyMethod(n - 2);
 * }
 *
 */

public class BuggyMethod {
    String result;
    String buggyMethod(int n) {
        if (n == 0) {
            result = "";
            return result;
        }
        result = n + " " + buggyMethod(n - 2);
        return result;
    }

    public static void main(String[] args) {
        BuggyMethod test = new BuggyMethod();
        test.launch();
    }

    public void launch() {
        buggyMethod(6);
        System.out.println(result);
    }
}