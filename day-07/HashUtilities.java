/**
 * 5.1 Hash function
 * Create a class HashUtilities that implements a simple hash function
 * shortHash(int) that takes any integer and returns an integer between 0 and
 * 1000. You can use the modulo operator and the static function Math.abs(int)
 * for obtaining the absolute value of an integer.
 * Note that shortHash(int) is a pure function (it does not have any side
 * effects), so it should be static. Then you can call this method using the
 * name of the class like HashUtilities.shortHash(int).
 * Every object in Java has the method hashCode(), that returns an int. Test
 * your hash function by passing the hash codes of different objects and
 * verifying that it always returns a number between 0 and 1000.
*/

public class HashUtilities {

    public static int shortHash(int yourNum) {
        int hashAssigned = Math.abs(yourNum) % 1000;
        return hashAssigned;
    }

    public static void main(String[] args) {
        
        System.out.print("Give me a number, I'll give you its shortHash: ");
        String str = System.console().readLine();

        // This line below will work for Strings
        // int hash = str.hashCode();

        // I only want Integer as input, right?
        int hash = Integer.parseInt(str);

        int smallHash = HashUtilities.shortHash(hash);
        System.out.println("0 < " + smallHash + " < 1000");

        // Using hashCode() to check how it works
        // System.out.println("The hashCode for " + str + " is: " + str.hashCode());
    }

}