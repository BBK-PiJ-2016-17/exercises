/**
 * Day 14 (Swapped with 15)
 *
 * Ex 1 - Recursive code, line by line
 * a) Do you see anything wrong with the following code? How would you fix it?
 *      (Note: refers to the dodgyMethod())
 *
 */

public class Dodgy {

    public static void main(String[] args) {
        Dodgy test = new Dodgy();
        test.launch();
    }

    public void launch() {
        dodgyMethod(17);
    }

    // Incompatible types?
    // We are mixing Strings and ints

//    public String dodgyMethod(int n) {
//        String result = dodgyMethod(n - 3) + n + dodgyMethod(n - 2);
//        if (n <= 0) {
//            return "";
//        }
//        return result;
//    }

    // Fixed version - Can't fix
    public String dodgyMethod(int n) {
        System.out.println(n);
        String result = dodgyMethod(n - 3) + n + dodgyMethod(n - 2);
        if (n <= 0) {
            String str = String.valueOf(n);
            return str;
        }
        return result;
    }
}
