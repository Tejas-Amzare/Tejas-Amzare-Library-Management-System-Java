public class Book {
    private int id;
    private String title;
    private boolean isIssued;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getID() {
        return id;
    }

    public String gettitle() {
        return title;
    }

    public String author() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void IssueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    @Override
    public String toString() {
        return "book ID  -:- " + id + ",title  -:- " + title + ",author  -:- " + author + ",isISSued  -:- " + isIssued;
    }
}
