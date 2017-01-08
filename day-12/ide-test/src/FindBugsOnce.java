/**
 * Day 12 - Ex 3 Practice ”Find bugs once”
 *
 * The method getInitials(String) has a bug! If you introduce a name with more than one space between words,
 * it throws an exception.
 * Create a class that contains the method getInitials(String) as described in the notes. Create also the test
 * class as described in the notes.
 * Then follow the “find bugs once” algorithm: reproduce the bug manually, reproduce the bug programmatically
 * by adding a new test to the testing class, then fix the bug and check that all tests pass.
 *
 * @author Ginestra Ferraro
 */

public class FindBugsOnce {

    public String getInitials(String fullName) {
        String result = "";
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            String nextInitial = "" + words[i].charAt(0);
            result = result + nextInitial.toUpperCase();
        }
        return result;
    }
}
