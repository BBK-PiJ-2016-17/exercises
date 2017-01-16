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

    public LibraryImpl(String libName) {
        this.libName = libName;
    }

    public String getLibName() {
        return libName;
    }

    public int getLibID() {
        return 24;
    }
}
