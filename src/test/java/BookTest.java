import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

        Book book;

        @Before
        public void before(){
            book = new Book("The Bible", "The Apostles", "Fiction");
        }

        @Test
        public void hasTitle(){
            assertEquals("The Bible", book.getTitle());
        }

        @Test
        public void hasAuthor(){
            assertEquals("The Apostles", book.getAuthor());
        }

        @Test
        public void hasGenre() {
            assertEquals("Fiction", book.getGenre());
        }
}
