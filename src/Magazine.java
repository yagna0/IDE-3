public class Magazine extends LibraryItem {
    private String issueFrequency;

    // Constructor
    public Magazine(String title, String author, int yearPublished, int itemID, String issueFrequency) {
        super(title, author, yearPublished, itemID);
        this.issueFrequency = issueFrequency;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Frequency: " + issueFrequency);
    }
}

