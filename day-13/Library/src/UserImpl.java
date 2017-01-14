/**
 * Day 13 - Practicing TDD
 *
 * @author Ginestra Ferraro
 */

public class UserImpl implements User {
    private final String name;
    private int libraryID;
    private Library library;

    public UserImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLibraryID() {
        return libraryID;
    }

    @Override
    public void setLibraryID(int libraryID) {
        this.libraryID = libraryID;
    }

    @Override
    public int register(Library library) {
        this.library = library;
        this.libraryID = library.getLibID();
        return this.libraryID;
    }

    @Override
    public Library getLibrary() {
        return library;
    }
}
