package Library;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<String> authors;
    private String isbn;
    private boolean isAvailable;
    private Patron borrowedBy;

    public Book(String title, List<String> authors, String isbn) {
        this.title = title;
        this.authors = authors;
        this.isbn = isbn;
        this.isAvailable = true;
        this.borrowedBy = null;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook(Patron patron) {
        this.isAvailable = false;
        this.borrowedBy = patron;
    }

    public void returnBook() {
        this.isAvailable = true;
        this.borrowedBy = null;
    }

    public Patron getBorrowedBy() {
        return borrowedBy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", isbn='" + isbn + '\'' +
                ", isAvailable=" + isAvailable +
                ", borrowedBy=" + (borrowedBy != null ? borrowedBy.getName() : "None") +
                '}';
    }
}
