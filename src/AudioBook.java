public class AudioBook extends LibraryItem {
    private int audioLength;

    // Constructor
    public AudioBook(String title, String author, int yearPublished, int itemID, int audioLength) {
        super(title, author, yearPublished, itemID);
        this.audioLength = audioLength;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Audio Length (in minutes): " + audioLength);
    }

}

