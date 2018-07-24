package ExerciseTwo;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        StartExercises level2 = new StartExercises();
//        System.out.println("Blackjack: " + level2.blackjack(23, 1));
//        System.out.println("Blackjack: " + level2.blackjack(1, 23));
//        System.out.println("Blackjack: " + level2.blackjack(21, 20));
//        System.out.println("Blackjack: " + level2.blackjack(19, 18));
//        System.out.println("Blackjack: " + level2.blackjack(0, 0));
//        System.out.println("Blackjack: " + level2.blackjack(24, 30));
//
//        System.out.println("Unique Sum: " + level2.uniqueSum(1, 2, 3));
//        System.out.println("Unique Sum: " + level2.uniqueSum(1, 1, 3));
//        System.out.println("Unique Sum: " + level2.uniqueSum(1, 2, 2));
//        System.out.println("Unique Sum: " + level2.uniqueSum(1, 1, 1));
//
//        System.out.println("Too Hot: "+ level2.tooHot(60,true));
//        System.out.println("Too Hot: "+ level2.tooHot(100,true));
//        System.out.println("Too Hot: "+ level2.tooHot(50,true));
//        System.out.println("Too Hot: "+ level2.tooHot(120,true));
//        System.out.println("Too Hot: "+ level2.tooHot(60,false));
//        System.out.println("Too Hot: "+ level2.tooHot(90,false));
//        System.out.println("Too Hot: "+ level2.tooHot(91,false));

//        People person1 = new People("Tim", 25, "Chef");
//        People person2 = new People("Sim", 28, "Painter");
//        People person3 = new People("Nim", 29, "Driver");
//        People person4 = new People("Lim", 24, "Waiter");
//        People person5 = new People("Wim", 30, "Trainee");
////
//        level2.storePeople.add(person1);
//        level2.storePeople.add(person2);
//        level2.storePeople.add(person3);
//        level2.storePeople.add(person4);
//        level2.storePeople.add(person5);
////
//        for (People i : level2.storePeople){
//            System.out.println(i.toString());
//        }
//
//        System.out.println(level2.findPerson("Oim"));

//        Garage garage = new Garage();
//        garage.setup();
//        garage.calculateBill();
//        garage.add(new Car(7, 6, 6));
//        System.out.println(garage.fix(2));
//        System.out.println("Before removing vehicle" + garage.myVehicles.size());
//        garage.remove(1);
//        garage.removeType("Car");
//        System.out.println("After removing vehicle " + garage.myVehicles.size());
//        garage.emptyGarage();
//        System.out.println("Remove all vehicle " + garage.myVehicles.size());

//        PaintWizard paint = new PaintWizard();
//        paint.bestPaint(1);

//        level2.storePerson.add(new Person("Tim", "Chef", 30));
//        level2.storePerson.add(new Person("Kim", "Waiter", 20));
//        level2.storePerson.add(new Person("Sim", "Teacher", 35));
//        level2.storePerson.add(new Person("Zim", "Driver", 40));
//        level2.storePerson.add(new Person("Dim", "Receptionist", 27));
//
//        try {
//            File file;
//            FileWriter fw;
//            BufferedWriter writer;
//            for (Person each : level2.storePerson) {
//                file = new File(each.name + ".txt");
//                fw = new FileWriter(file);
//                writer = new BufferedWriter(fw);
//                writer.write("Name: " + each.name + ", Occupation: " + each.occupation +
//                        ", Age: " + each.age);
//                writer.close();
//                fw.close();
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        try {
//            FileReader fr;
//            BufferedReader reader;
//            String eachLine;
//            for (Person each : level2.storePerson) {
//                fr = new FileReader(each.name + ".txt");
//                reader = new BufferedReader(fr);
//                while ((eachLine = reader.readLine()) != null) {
//                    String[] splitted = eachLine.split(",");
//                    String build = null;
//                    for (int i = 0; i < splitted.length; i++) {
//                        String[] names = splitted[i].split(":");
//                        build += names[1];
//                    }
//                    level2.readPerson.add(build.substring(5));
//                }
//                reader.close();
//                fr.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        for (String j : level2.readPerson) {
//            System.out.println(j);
//        }

        Integer ag = 5;
        System.out.println(ag);
        mod(ag);
        System.out.println(ag);
    }

    public static void mod(Integer age){
        System.out.println(age);
        age = 7;
    }
}
