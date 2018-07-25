package Flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class RoomFactory {
    static Map<Color, RoomType> roomType = new HashMap<>();

    public static RoomType getRoomType(Color colour, String name) {
        RoomType out = roomType.get(colour);
        if (out == null) {
            out = new RoomType(name, colour);
            roomType.put(colour, out);
        }
        return out;
    }
}

