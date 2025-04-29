import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<LibraryItem> catalog = new ArrayList<>();

        while (true) {
            System.out.println("\nLibrary Manager");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a Magazine");
            System.out.println("3. Add an AudioBook");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                // Add a book
                String title = "";
                while (title.isEmpty()) {
                    System.out.print("Enter Book Title: ");
                    title = scanner.nextLine();
                    if (title.isEmpty()) {
                        System.out.println("You did not enter a title. Please try again.");
                    }
                }

                System.out.print("Enter Author: ");
                String author = scanner.nextLine();
                System.out.print("Enter Year Published: ");
                int yearPublished = scanner.nextInt();
                System.out.print("Enter Item ID: ");
                int itemID = scanner.nextInt();
                System.out.print("Enter Number of Pages: ");
                int numPages = scanner.nextInt();
                scanner.nextLine();

                // new Book object and add to catalog
                Book book = new Book(title, author, yearPublished, itemID, numPages);
                catalog.add(book);
                System.out.println("Book added to the catalog!");

            } else if (choice == 2) {
                // Add a magazine
                String title = "";
                while (title.isEmpty()) {
                    System.out.print("Enter Magazine Title: ");
                    title = scanner.nextLine();
                    if (title.isEmpty()) {
                        System.out.println("You did not enter a title. Please try again.");
                    }
                }

                System.out.print("Enter Author: ");
                String author = scanner.nextLine();
                System.out.print("Enter Year Published: ");
                int yearPublished = scanner.nextInt();
                System.out.print("Enter Item ID: ");
                int itemID = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Issue Frequency (e.g., Monthly, Weekly): ");
                String issueFrequency = scanner.nextLine();

                // new Magazine object
                Magazine magazine = new Magazine(title, author, yearPublished, itemID, issueFrequency);
                catalog.add(magazine);
                System.out.println("Magazine added to the catalog!");

            } else if (choice == 3) {
                // Add an audiobook
                String title = "";
                while (title.isEmpty()) {
                    System.out.print("Enter AudioBook Title: ");
                    title = scanner.nextLine();
                    if (title.isEmpty()) {
                        System.out.println("You did not enter a title. Please try again.");
                    }
                }

                System.out.print("Enter Author: ");
                String author = scanner.nextLine();
                System.out.print("Enter Year Published: ");
                int yearPublished = scanner.nextInt();
                System.out.print("Enter Item ID: ");
                int itemID = scanner.nextInt();
                System.out.print("Enter Audio Length (in minutes): ");
                int audioLength = scanner.nextInt();
                scanner.nextLine();

                // new AudioBook object
                AudioBook audioBook = new AudioBook(title, author, yearPublished, itemID, audioLength);
                catalog.add(audioBook);
                System.out.println("AudioBook added to the catalog!");

            } else if (choice == 4) {
                // Display all catalogs
                System.out.println("\nLibrary Catalog:");
                for (LibraryItem item : catalog) {
                    item.displayInfo();
                    System.out.println();
                }
            } else if (choice == 5) {
                // Exit the program
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
