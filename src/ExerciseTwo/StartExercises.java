package ExerciseTwo;

import java.util.ArrayList;

public class StartExercises {
    public ArrayList<People> storePeople = new ArrayList<>();
    public ArrayList<Person> storePerson = new ArrayList<>();
    public ArrayList<String> readPerson = new ArrayList<>();

    public int blackjack(int firstValue, int secondValue) {
        if (firstValue <= 0 && secondValue <= 0) {
            return 0;
        }
        if (firstValue > 21 && secondValue > 21) {
            return 0;
        }

        if (firstValue <= 21 && (firstValue > secondValue || secondValue > 21)) {
            return firstValue;
        }

        if (secondValue <= 21 && (secondValue > firstValue || firstValue > 21)) {
            return secondValue;
        }

        return -1;
    }

    public int uniqueSum(int value1, int value2, int value3) {
        if (value1 == value2 && value2 == value3) return 0;
        if (value1 == value2) return value3;
        if (value1 == value3) return value2;
        if (value2 == value3) return value1;
        return value1 + value2 + value3;
    }

    public boolean tooHot(int temp, boolean isSummer) {
        if (isSummer && (temp >= 60 && temp <= 100)) return true;
        if (temp >= 60 && temp <= 90) return true;
        if (!isSummer && (temp < 60 || temp > 90)) return false;
        if (isSummer && (temp < 60 || temp > 90)) return false;
        return false;
    }


    public People findPerson(String name) {
        for (People i : storePeople) {
            if (i.name.equals(name)) {
                return i;
            }
        }
        return null;
    }
}
