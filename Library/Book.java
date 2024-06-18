package Library;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<String> authors;
    private String isbn;
    private int totalCopies;
    private int availableCopies;
    private List<Patron> borrowedBy;

    public Book(String title, List<String> authors, String isbn, int copies) {
        this.title = title;
        this.authors = authors;
        this.isbn = isbn;
        this.totalCopies = copies;
        this.availableCopies = copies;
        this.borrowedBy = new ArrayList<>();
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

    public int getTotalCopies() {
        return totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void borrowBook(Patron patron) {
        if (availableCopies > 0) {
            availableCopies--;
            borrowedBy.add(patron);
        }
    }

    public void returnBook(Patron patron) {
        availableCopies++;
        borrowedBy.remove(patron);
    }

    public List<Patron> getBorrowedBy() {
        return borrowedBy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", isbn='" + isbn + '\'' +
                ", totalCopies=" + totalCopies +
                ", availableCopies=" + availableCopies +
                ", borrowedBy=" + borrowedBy +
                '}';
    }
}
