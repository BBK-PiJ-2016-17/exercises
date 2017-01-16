/**
 * Day 13 - Practicing TDD
 *
 * Creating a Library mock class for testing purposes
 *
 * @author Ginestra Ferraro
 */

public class LibraryImpl implements Library {

    private String libName;
    private int libID;
    private int numBooksBorrowed;

    public LibraryImpl(String libName) {
        this.libName = libName;
        this.libID = libID; // needed?
    }

    public String getLibName() {
        return libName;
    }

    public String getUserID(String userID) {

        // Check for the user name and return it's ID


        if (userID.isEmpty()) {
            // Create a unique ID and then return it
            return userID;
        }
        return userID;
    }

    public int getMaxBooksPerUser() {
        return numBooksBorrowed;
    }
}
