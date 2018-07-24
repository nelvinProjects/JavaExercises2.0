package LibraryTests;

import Library.Withdraw;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class WithdrawTest {

    @Test
    void getCustomerID() {
        Withdraw withdraw = new Withdraw(2, 3, LocalDate.now(), LocalDate.now().plusDays(7));
        Assert.assertEquals("Customer ID do not match", 2, withdraw.getCustomerID());

        Withdraw withdraw2 = new Withdraw(4, 3, LocalDate.now(), LocalDate.now().plusDays(7));
        Assert.assertEquals("Customer ID do not match", 4, withdraw2.getCustomerID());
    }

    @Test
    void getBookID() {
        Withdraw withdraw = new Withdraw(2, 3, LocalDate.now(), LocalDate.now().plusDays(7));
        Assert.assertEquals("Book ID do not match", 3, withdraw.getBookID());

        Withdraw withdraw2 = new Withdraw(4, 9, LocalDate.now(), LocalDate.now().plusDays(7));
        Assert.assertEquals("Book ID do not match", 9, withdraw2.getBookID());
    }

}
