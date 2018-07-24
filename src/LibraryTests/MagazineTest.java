package LibraryTests;

import Library.Magazine;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MagazineTest {
    @Test
    void getPublisher() {
        Magazine mag = new Magazine(4, "SciHealth", "Book ltd", "Health");
        Assert.assertEquals("Category Wrong", "Book ltd", mag.getPublisher());
    }

    @Test
    void setPublisher() {
        Magazine mag = new Magazine(4, "SciHealth", "Book ltd", "Health");
        mag.setPublisher("Sold ltd");
        Assert.assertEquals("Category Wrong", "Sold ltd", mag.getPublisher());
    }

    @Test
    void getCategory() {
        Magazine mag = new Magazine(4, "SciHealth", "Book ltd", "Health");
        Assert.assertEquals("Category Wrong", "Health", mag.getCategory());
    }

    @Test
    void setCategory() {
        Magazine mag = new Magazine(4, "SciHealth", "Book ltd", "Health");
        mag.setCategory("Science");
        Assert.assertEquals("Category Wrong", "Science", mag.getCategory());
    }
}
