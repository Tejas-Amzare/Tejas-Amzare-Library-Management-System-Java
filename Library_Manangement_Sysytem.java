import java.util.*;

public class Library_Manangement_Sysytem {
    public static void main(String args[]) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println(
                    "======================= *** WELCOME TO LIBRARY MANAGEMENT SYSTEM *** =======================");
            System.out.println();
            System.out.println(
                    "=============================== *** ENTER YOUR CHOICE *** ===============================");
            System.out.println();
            System.out.println("1].ADD BOOK \t\t\t 2].VIEW ALL BOOK \t\t\t 3].SEARCH FOR A BOOK");
            System.out.println();
            System.out.println("4].ISSUED BOOK \t\t\t 5].RETURN BOOK \t\t\t 6].EXIT");
            System.out.println("\nEnter here --:--");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Book ID :- ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Book Title :- ");
                    String title = scanner.nextLine();
                    System.out.println("Enter Book Author :- ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));

                    break;
                case 2:
                    library.viewBook();
                    break;

                case 3:
                    System.out.println("Enter Book Title to Search :- ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                    break;

                case 4:
                    System.out.println("Enter a Book ID Issue");
                    int IssueID = scanner.nextInt();
                    library.IssueBook(IssueID);
                    break;

                case 5:
                    System.out.println("Enter a Book ID Return :- ");
                    int returnID = scanner.nextInt();
                    library.returnBook(returnID);
                    break;

                case 6:
                    System.out.println("Successfuly Exited");
                    System.out.println("=========  Thanks to visited library  ==========");
                    break;

                default:
                    System.out.println("Invalid Choice , Try Again.");

            }

        } while (choice != 6);
        {
            scanner.close();
        }

    }
}
