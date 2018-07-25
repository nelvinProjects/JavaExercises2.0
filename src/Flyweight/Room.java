package Flyweight;

public class Room {
    private int width, height;
    private RoomType type;

    public Room(int width, int height, RoomType type){
        this.width = width;
        this.height = height;
        this.type = type;
    }
}

