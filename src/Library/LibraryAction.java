package Library;

public interface LibraryAction {
    public boolean checkout(int id, int customerID);

    public boolean checkIn(int id, int customerID);

    public void addCustomer(Person p);

    public boolean removeCustomer(int id);

    public boolean removeItem(int id);

    public boolean addItem(LibraryItem id);
}
