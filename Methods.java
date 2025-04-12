public class Methods {
    public static void main(String[] args) {
        // methods = a block of reusable code that is executed when you called ()

        // String name = "Juan Esteban";
        // int age = 25;

        // happyBrithday(name, age);
        // happyBrithday(name, age);
        // happyBrithday(name, age);

        int age = 17;
        if (ageCheck(age)) {
            System.out.print("You may sign up!");
        } else {
            System.out.println("You must be 18+ to sign up");
        }

        System.out.println();

        String fullName = getFullName("Spongebob", "Squarepants");
        System.out.println(fullName);

        double squaredResult = square(3);
        System.out.println(squaredResult);

        double cubicResult = cube(4);
        System.out.println(cubicResult);

    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    static String getFullName(String firstName, String secondName) {
        return firstName + " " + secondName;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static double square(double number) {

        return number * number;
    }

    static void happyBrithday(String name, int age) {
        // The name of the parameters can have a different name than the arguments
        System.out.println("Happy brithday to you!");
        System.out.printf("Happy brithday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy brithday to you!\n");
    }
}
