import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int maxStock;

public Library(){
    this.stock = new ArrayList<>();
    this.maxStock = 3;
    }

    public void addBook(Book book) {
        if (this.stock.size() < this.maxStock) {
            this.stock.add(book);
        }
        return;
    }

    public int getStock() {return this.stock.size();}

    public int getMaxStock() {return maxStock;}


}
