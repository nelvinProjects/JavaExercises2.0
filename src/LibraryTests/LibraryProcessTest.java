package LibraryTests;

import Library.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LibraryProcessTest {
    @Test
    void checkout() {
        LibraryProcess libraryProcess = new LibraryProcess();
        Assert.assertEquals("Book not checkout", true, libraryProcess.checkout(1, 5));
        Assert.assertEquals("Book not checkout", false, libraryProcess.checkout(1, 5));
    }

    @Test
    void checkIn() {
        LibraryProcess libraryProcess = new LibraryProcess();
        libraryProcess.checkout(1, 5);
        libraryProcess.checkout(2, 4);
        Assert.assertEquals("Book not checked in", true, libraryProcess.checkIn(1, 5));
        Assert.assertEquals("Book not checked in", false, libraryProcess.checkIn(1, 5));
    }

    @Test
    void addCustomer() {
        LibraryProcess libraryProcess = new LibraryProcess();
        libraryProcess.addCustomer(new Person(1, "Wim"));
        libraryProcess.addCustomer(new Person(2, "Nim"));
        Assert.assertEquals("Customer doesn't match", "1 Wim", libraryProcess.getCustomer(1));
        Assert.assertEquals("Customer doesn't match", "2 Nim", libraryProcess.getCustomer(2));
        Assert.assertEquals("Customer exists", "null", libraryProcess.getCustomer(4));
    }

    @Test
    void removeCustomer() {
        LibraryProcess libraryProcess = new LibraryProcess();
        libraryProcess.addCustomer(new Person(4, "Qim"));
        Assert.assertEquals("Customer not removed", true, libraryProcess.removeCustomer(4));
        Assert.assertEquals("Customer not removed", false, libraryProcess.removeCustomer(4));
    }

    @Test
    void removeItem() {
        LibraryProcess libraryProcess = new LibraryProcess();
        libraryProcess.addItem(new Book(1, "Book of Squares", "BooksInc", "Action"));
        libraryProcess.addItem(new Book(2, "Book of Triangle", "BooksIn", "Comedy"));
        Assert.assertEquals("Book not removed", true, libraryProcess.removeItem(2));
        Assert.assertEquals("Book not removed", false, libraryProcess.removeItem(2));
    }

    @Test
    void addItem() {
        LibraryProcess libraryProcess = new LibraryProcess();
        Assert.assertEquals("Book not added", true, libraryProcess.addItem(new Maps(2, "England")));
        Assert.assertEquals("Book not added", false, libraryProcess.addItem(new Maps(2, "England")));
        Assert.assertEquals("Book not added", true, libraryProcess.addItem(new Magazine(3, "Cars",
                "CarsMag", "Vehicles")));
    }
}