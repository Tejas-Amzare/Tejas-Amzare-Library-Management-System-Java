import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Books added sucessfully ");
    }

    public void viewBook() {
        if (books.isEmpty()) {
            System.out.println("No! books in library");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.gettitle().equalsIgnoreCase(title))
                ;
            System.out.println(book);
            found = true;
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    public void IssueBook(int id) {
        for (Book book : books) {
            if (book.getID() == id && !book.isIssued()) {
                book.IssueBook();
                System.out.println("Book is issued successfuly");
                return;
            }
        }
        System.out.println("Book are not found or already issued");

    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getID() == id && !book.isIssued()) {
                book.returnBook();
                System.out.println("Book return successfuly");
                return;
            }
        }
        System.out.println("Book not found or not issued");
    }
}
