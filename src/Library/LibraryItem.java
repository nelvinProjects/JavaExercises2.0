package Library;

public abstract class LibraryItem {
    private int itemID;
    private String name;

    public LibraryItem(int itemID, String name){
        this.itemID = itemID;
        this.name = name;
    }

    public int getItemID(){
        return this.itemID;
    }

    public String getName(){
        return this.name;
    }

    public boolean setID(int newID){
        this.itemID = newID;
        if (this.itemID == newID) return true;
        else return false;
    }

    public boolean setName(String newName){
        this.name = newName;
        if (this.name.equals(newName)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "itemID=" + itemID +
                ", name='" + name + '\'' +
                '}';
    }
}
