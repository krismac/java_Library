import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

        private Library library;
        private Book book;
        private Book book1;
        private Book book2;

        @Before
        public void before(){
            library = new Library();
            book = new Book("The Bible", "The Apostles", "Fiction");
            book1 = new Book("Dancing with the Tsars", "Ross OCarrol Kelly", "Comedy");
            book2 = new Book("Ulysses", "James Joyce", "Classic");
        }

        @Test
        public void canAddStockToLibrary(){
            library.addBook(book);
            assertEquals(1, library.getStock());
        }

        @Test
        public void hasMaxCapacity(){
            assertEquals(3, library.getMaxStock());
        }

        @Test
        public void canAddBookUpToMaxCapacity(){
            library.addBook(book);
            library.addBook(book1);
            assertEquals(2, library.getStock());
        }

        @Test
        public void canNotAddBookBeyondMaxCapacity(){
            library.addBook(book);
            library.addBook(book1);
            assertEquals(2, library.getStock());
        }



}
