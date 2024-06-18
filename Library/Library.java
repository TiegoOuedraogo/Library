package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;
    private Patron activePatron;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
        this.activePatron = null;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    public void switchPatron(String patronName) {
        for (Patron patron : patrons) {
            if (patron.getName().equals(patronName)) {
                activePatron = patron;
                return;
            }
        }
        System.out.println("Patron not found!");
    }

    public void borrowBook(String title) {
        if (activePatron == null) {
            System.out.println("No active patron. Please switch to a patron first.");
            return;
        }
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getAvailableCopies() > 0) {
                book.borrowBook(activePatron);
                activePatron.borrowBook(book);
                System.out.println("Book borrowed successfully.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(String title) {
        if (activePatron == null) {
            System.out.println("No active patron. Please switch to a patron first.");
            return;
        }
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getBorrowedBy().contains(activePatron)) {
                book.returnBook(activePatron);
                activePatron.returnBook(book);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not borrowed by the active patron.");
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void searchByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                System.out.println(book);
            }
        }
    }

    public void searchPartial(String keyword) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) || 
                book.getAuthors().stream().anyMatch(a -> a.toLowerCase().contains(keyword.toLowerCase()))) {
                System.out.println(book);
            }
        }
    }

    public void listAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listBorrowedBooks() {
        for (Book book : books) {
            if (book.getBorrowedBy().size() > 0) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Adding sample books
        library.addBook(new Book("Meeting the Universe Halfway", List.of("Karen Barad"), "978-0822339175", 3));
        library.addBook(new Book("The Programmer's Brain", List.of("Felienne Hermans"), "978-1617298677", 2));
        library.addBook(new Book("Blindsight", List.of("Peter Watts"), "978-1250237484", 4));
        library.addBook(new Book("Test Driven Development", List.of("Kent Beck"), "978-0321146533", 1));
        library.addBook(new Book("This Is How You Lose the Time War", List.of("Amal El-Mohtar", "Max Gladstone"), "978-1529405231", 5));

        // Command-line interaction loop
        Scanner scanner = new Scanner(System.in);
        String[] actions = {
            "borrow", "return", "search", "search by author", "search partial", 
            "list all books", "list borrowed books", "register patron", 
            "switch patron", "new item", "quit"
        };

        while (true) {
            System.out.println("Available Actions:");
            for (int i = 0; i < actions.length; i++) {
                System.out.printf("%d: %s%n", i, actions[i]);
            }

            System.out.print("Please enter the number of your action: ");
            int actionNumber;
            try {
                actionNumber = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (actionNumber < 0 || actionNumber >= actions.length) {
                System.out.println("Invalid action number. Please try again.");
                continue;
            }

            String action = actions[actionNumber];
            switch (action) {
                case "borrow":
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case "return":
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case "search":
                    System.out.print("Enter the title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                    break;
                case "search by author":
                    System.out.print("Enter the author to search: ");
                    String searchAuthor = scanner.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;
                case "search partial":
                    System.out.print("Enter the keyword to search: ");
                    String keyword = scanner.nextLine();
                    library.searchPartial(keyword);
                    break;
                case "list all books":
                    library.listAllBooks();
                    break;
                case "list borrowed books":
                    library.listBorrowedBooks();
                    break;
                case "register patron":
                    System.out.print("Enter the name of the new patron: ");
                    String patronName = scanner.nextLine();
                    library.registerPatron(new Patron(patronName));
                    System.out.println("Patron registered successfully.");
                    break;
                case "switch patron":
                    System.out.print("Enter the name of the patron to switch to: ");
                    String switchPatronName = scanner.nextLine();
                    library.switchPatron(switchPatronName);
                    System.out.println("Switched to patron: " + switchPatronName);
                    break;
                case "new item":
                    System.out.print("Enter the type of item (book/cd/dvd): ");
                    String itemType = scanner.nextLine().trim().toLowerCase();
                    if ("book".equals(itemType)) {
                        System.out.print("Enter the title of the book: ");
                        String newBookTitle = scanner.nextLine();
                        System.out.print("Enter the authors of the book (comma-separated): ");
                        List<String> newBookAuthors = List.of(scanner.nextLine().split(","));
                        System.out.print("Enter the ISBN of the book: ");
                        String newBookIsbn = scanner.nextLine();
                        System.out.print("Enter the number of copies: ");
                        int newBookCopies = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        library.addBook(new Book(newBookTitle, newBookAuthors, newBookIsbn, newBookCopies));
                        System.out.println("New book added successfully.");
                    }
                    // Implement CD and DVD addition here similarly
                    break;
                case "quit":
                    System.out.println("Exiting the library system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid action. Please try again.");
                    break;
            }
        }
    }
}


