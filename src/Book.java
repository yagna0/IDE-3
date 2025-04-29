public class Book extends LibraryItem {
    private int numPages;

    // Constructor
    public Book(String title, String author, int yearPublished, int itemID, int numPages) {
        super(title, author, yearPublished, itemID);
        this.numPages = numPages;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Pages: " + numPages);
    }
}

