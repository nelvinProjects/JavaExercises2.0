package Library;

public class Magazine extends LibraryItem {
    private String publisher;
    private String category;

    public Magazine(int id, String name, String publisher, String category) {
        super(id, name);
        this.publisher = publisher;
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public boolean setPublisher(String name) {
        this.publisher = name;
        if (this.publisher.equals(name)) {
            return true;
        } else return false;
    }

    public void setCategory(String name){
        this.category = name;
    }
}
