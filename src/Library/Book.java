package Library;

public class Book extends LibraryItem {
    private String publisher;
    private String genre;

    public Book(int id, String name, String publisher, String genre){
        super(id, name);
        this.publisher = publisher;
        this.genre = genre;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public void setPublisher(String name){
        this.publisher = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
