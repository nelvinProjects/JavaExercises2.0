package ExerciseTwo;

import org.junit.Test;


import static org.junit.Assert.*;

public class StartExercisesTest {
    StartExercises startExercises = new StartExercises();

    @Test
    public void uniqueSum() {
        assertEquals(6, startExercises.uniqueSum(1, 2, 3));
        assertEquals(0, startExercises.uniqueSum(1, 1, 1));
        assertEquals(2, startExercises.uniqueSum(1, 1, 2));
        assertEquals(1, startExercises.uniqueSum(1, 3, 3));
    }

    @Test
    public void tooHot() {
        assertTrue(startExercises.tooHot(60, false));
        assertTrue(startExercises.tooHot(60, true));
        assertTrue(startExercises.tooHot(80, true));
        assertTrue(startExercises.tooHot(80, false));
        assertFalse(startExercises.tooHot(100, false));
        assertTrue(startExercises.tooHot(90, false));
        assertFalse(startExercises.tooHot(91, false));
        assertTrue(startExercises.tooHot(100, true));
        assertFalse(startExercises.tooHot(101, true));
        assertFalse(startExercises.tooHot(59, true));
        assertFalse(startExercises.tooHot(59, false));
    }

    @Test
    public void findPerson() {
        startExercises.storePeople.add(new People("Tim", 25, "Chef"));
        startExercises.storePeople.add(new People("Sim", 28, "Painter"));
        startExercises.storePeople.add(new People("Nim", 29, "Driver"));
        startExercises.storePeople.add(new People("Lim", 24, "Waiter"));
        startExercises.storePeople.add(new People("Wim", 30, "Trainee"));
        String person = "Name: Tim Age: 25 Job Title: Chef";
        String person2 = "Name: Wim Age: 30 Job Title: Trainee";
        assertEquals(person, startExercises.findPerson("Tim").toString());
        assertEquals(person2, startExercises.findPerson("Wim").toString());
//        assertEquals(NullPointerException.class, startExercises.findPerson("Kim").toString());
    }
}