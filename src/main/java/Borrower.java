import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;
    private int maxCollection;

    public Borrower() {
        this.collection = new ArrayList<>();
        this.maxCollection = 3;
    }

    public void addBookToCollection(Book book) {
        if (this.collection.size() < this.maxCollection) {
            this.collection.add(book);
        }
        return;
    }

    public int getCollectionCount() {
        return this.collection.size();
    }

}
