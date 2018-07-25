package Flyweight;

import java.awt.*;

public class DemoRun {
    static int ROOMS_NEEDED = 1000;
    static int ROOM_COLOURS = 4;

    public static void main(String[] args) {
        Flat flat = new Flat();
        for (int i = 0; i < ROOMS_NEEDED / ROOM_COLOURS; i++) {
            flat.createApartment(Integer.valueOf((int) Math.random() * 10), Integer.valueOf((int) Math.random() * 10),
                    "Small", Color.red);
            flat.createApartment(Integer.valueOf((int) Math.random() * 10), Integer.valueOf((int) Math.random() * 10),
                    "Medium", Color.green);
            flat.createApartment(Integer.valueOf((int) Math.random() * 10), Integer.valueOf((int) Math.random() * 10),
                    "Large", Color.blue);
            flat.createApartment(Integer.valueOf((int) Math.random() * 10), Integer.valueOf((int) Math.random() * 10),
                    "X-Large", Color.gray);
        }

    }
}
