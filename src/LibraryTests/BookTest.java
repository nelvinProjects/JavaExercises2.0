package LibraryTests;

import Library.Book;
import org.junit.Assert;
import org.junit.Test;

public class BookTest {
    @Test
    public void getPublisher() {
        Book book = new Book(3, "Cars go around", "CarBook", "fiction");
        Assert.assertEquals("Value doesn't match", "CarBook", book.getPublisher());
    }

    @Test
    public void setPublisher() {
        Book book = new Book(3, "Cars go around", "CarBook", "fiction");
        book.setPublisher("CarsSin");
        Assert.assertEquals("Value doesn't match", "CarsSin", book.getPublisher());
    }

    @Test
    public void getGenre() {
        Book book = new Book(3, "Cars go around", "CarBook", "fiction");
        Assert.assertEquals("Genre not match", "fiction", book.getGenre());
    }

    @Test
    public void setGenre() {
        Book book = new Book(3, "Cars go around", "CarBook", "fiction");
        book.setGenre("Non-fiction");
        Assert.assertEquals("Genre not match", "Non-fiction", book.getGenre());
    }
}
