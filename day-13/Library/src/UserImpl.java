/**
 * Day 13 - Practicing TDD
 *
 * @author Ginestra Ferraro
 */

public class UserImpl implements User {
    private final String name;
    private int libraryID;

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
}
