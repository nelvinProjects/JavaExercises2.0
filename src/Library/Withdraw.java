package Library;

import java.time.LocalDate;

public class Withdraw {
    private int customerID;
    private int bookID;
    private LocalDate date;
    private LocalDate returnDate;

    public Withdraw(int customerID, int bookID, LocalDate date, LocalDate returnDate) {
        this.customerID = customerID;
        this.bookID = bookID;
        this.date = date;
        this.returnDate = returnDate;
    }

    public int getCustomerID(){
        return this.customerID;
    }

    public int getBookID(){
        return this.bookID;
    }

    @Override
    public String toString() {
        return "Withdraw{" +
                "customerID=" + customerID +
                ", bookID=" + bookID +
                ", date=" + date +
                ", returnDate=" + returnDate +
                '}';
    }
}
