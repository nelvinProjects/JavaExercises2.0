package Library;

import java.time.LocalDate;
import java.util.ArrayList;

public class LibraryProcess implements LibraryAction {
    private ArrayList<Person> customers = new ArrayList<>();
    private ArrayList<Withdraw> itemOut = new ArrayList<>();
    private ArrayList<LibraryItem> shelf = new ArrayList<>();


    @Override
    public boolean checkout(int itemID, int customerID) {
        for (Withdraw w : itemOut) {
            if (w.getCustomerID() == customerID && w.getBookID() == itemID) {
                return false;
            }
        }
        itemOut.add(new Withdraw(customerID, itemID, LocalDate.now(), LocalDate.now().plusDays(7)));
//        for (Withdraw w: itemOut){
//            System.out.println(w.toString());
//        }
        return true;
    }

    @Override
    public boolean checkIn(int itemID, int customerID) {
        for (Withdraw w : itemOut) {
            if (w.getCustomerID() == customerID && w.getBookID() == itemID) {
                itemOut.remove(w);
                return true;
            }
        }
//        for (Withdraw j : itemOut) System.out.println(j.toString());
        return false;
    }

    public void addCustomer(Person p) {
        customers.add(p);
    }

    public String getCustomer(int id) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerID() == id) {
                return customers.get(i).getCustomerID() + " " + customers.get(i).getCustomerName();
            }
        }
        return "null";
    }

    public boolean removeCustomer(int id) {
        for (Person p : customers) {
            if (p.getCustomerID() == id) {
                customers.remove(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(int id) {
        for (LibraryItem item : shelf) {
            if (item.getItemID() == id) {
                shelf.remove(item);
                return true;
            }
        }

//        for (LibraryItem k : shelf) System.out.println(k.toString());
        return false;
    }

    @Override
    public boolean addItem(LibraryItem item) {
        for (LibraryItem i : shelf) {
            if (i.getItemID() == item.getItemID()) return false;
        }
        shelf.add(item);
        for (LibraryItem k : shelf) System.out.println(k.toString());
        return true;
    }
}
