package LibraryTests;

import Library.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void getCustomerID() {
        Person person = new Person(1, "Sim");
        Person person2 = new Person(3, "Kim");
        Assert.assertEquals("ID do not match", 3, person2.getCustomerID());
        Assert.assertEquals("ID do not match", 1, person.getCustomerID());
    }

    @Test
    void getCustomerName() {
        Person person = new Person(1, "Sim");
        Person person2 = new Person(3, "Kim");
        Assert.assertEquals("ID do not match", "Kim", person2.getCustomerName());
    }

    @Test
    void setCustomerID() {
        Person person = new Person(1,"Lim");
        Assert.assertEquals("Don't Match", 1, person.getCustomerID());
        person.setCustomerID(5);
        Assert.assertEquals("Don't Match", 5, person.getCustomerID());

    }

    @Test
    void setCustomerName() {
        Person person = new Person(1,"Lim");
        Assert.assertEquals("Don't Match", "Lim", person.getCustomerName());
        person.setCustomerName("Yim");
        Assert.assertEquals("Don't Match", "Yim", person.getCustomerName());
    }
}
