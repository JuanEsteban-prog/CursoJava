import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        // if statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        int age;
        int adultAge = 18;
        int minimunAge = 0;
        int seniorAge = 65;
        String name;
        boolean isStudent;

        System.out.print("What's your name? :");
        name = scanner.nextLine();

        System.out.print("What is your age?: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        if (name.isEmpty()) {
            System.out.println("You didn't enter your name :/");
        } else {
            System.out.println("Hello " + name + "!");
        }

        if (age >= seniorAge) {
            System.out.println("You are a Senior");
        } else if (age >= adultAge) {
            System.out.println("You are an adult :( ");
        } else if (age < minimunAge) {
            System.out.println("You haven't been born yet???");
        } else if (age == minimunAge) {
            System.out.println(" You are a new born!!!!!!");
        } else {
            System.out.println("You are a child!");
        }

        if (isStudent) {
            System.out.println("Good luck with college");
        } else {
            System.out.println("You are NOT enrolled!!");
        }

        scanner.close();

    }
}