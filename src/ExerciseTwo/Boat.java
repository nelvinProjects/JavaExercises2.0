package ExerciseTwo;

public class Boat extends Vehicle {
    String type;
    public Boat(int id, String type, int seats){
        super.id = id;
        super.seats = seats;
        this.type = type;
    }
}
