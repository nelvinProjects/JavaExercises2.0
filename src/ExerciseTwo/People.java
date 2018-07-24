package ExerciseTwo;

public class People {
    String name;
    int age;
    String jobTitle;

    public People(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        String toPrint = "Name: " + name + " Age: " + age + " Job Title: " + jobTitle;
        return toPrint;
    }

//    @Override
//    public boolean equals(){
//
//    }
}
