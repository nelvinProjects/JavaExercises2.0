package Flyweight;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Flat {
    private List<Room> rooms = new ArrayList<>();

    public void createApartment(int width, int height, String name, Color colour){
        RoomType type = RoomFactory.getRoomType(colour, name);
        Room room = new Room(width, height, type);
        rooms.add(room);
    }
}

