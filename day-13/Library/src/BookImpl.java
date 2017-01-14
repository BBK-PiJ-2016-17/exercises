/**
 * Day 13 - Practicing TDD
 *
 *
 * @author Ginestra Ferraro
 */

public class BookImpl {

    private String author;
    private String title;
    private Book thisBook;

    public BookImpl(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setBook(Book newBook) {
        thisBook = newBook;
    }
}
