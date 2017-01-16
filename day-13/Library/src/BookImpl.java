/**
 * Day 13 - Practicing TDD
 *
 *
 * @author Ginestra Ferraro
 */

public class BookImpl implements Book {

    private final String author;
    private final String title;
    // private Book thisBook;

    public BookImpl(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    // public void setBook(Book newBook) {
    //    thisBook = newBook;
    // }
}
