import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    //Add a third class which interacts with the other two.
    //E.g. you could add a Borrower with a method that takes a Book and moves to the Borrower's collection.

    //instance variables
    Book book;
    Borrower borrower;
    Library library;


    @Test
    public void removeBookToCollection() {
        library.addBook(book);
        assertEquals(1, borrower.addBookToCollection());
        assertEquals(0, borrower.getCollectionCount());
    }

}


