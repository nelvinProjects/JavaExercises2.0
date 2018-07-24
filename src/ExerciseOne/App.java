package ExerciseOne;

public class App {
    private String start = "Hello World!";
    private int[] numbers = new int[10];
    private int[] forMultiply = new int[10];

    private void printHellow(String value) {
        System.out.println(value);
    }

    private String returnHello() {
        return "Hello World!";
    }

    private int sum(int value1, int value2, boolean multiply) {
        if (value1 == 0) {
            return value2;
        }

        if (value2 == 0) {
            return value1;
        }

        if (multiply) {
            return value1 * value2;
        } else {
            return value1 + value2;
        }
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Hello World!");
        System.out.println(app.start);
        app.printHellow("Hello World!");
        System.out.println(app.returnHello());
        System.out.println("Multiply: " + app.sum(5, 5, true));
        System.out.println("Add: " + app.sum(5, 5, false));
        System.out.println("Condition 1: " + app.sum(0, 2, false));
        System.out.println("Condition 2: " + app.sum(3, 0, false));

        for (int i = 0; i < 10; i++){
            System.out.println("Loop "+i+ ": "+ app.sum(i, 2, false));
        }

        for (int i = 0; i < app.numbers.length; i++){
            app.numbers[i] = i * 2;
        }

        for (int i : app.numbers){
            System.out.println("Array: "+ app.sum(i, 2, false));
        }

        for (int i : app.numbers){
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++){
            app.forMultiply[i] = i+1;
            System.out.println(app.forMultiply[i]);
        }

        for (int i : app.forMultiply){
            System.out.println(i*10);
        }
    }
}
