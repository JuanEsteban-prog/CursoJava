import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        // Scanner = object that allows us to accept user input.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String name = scanner.nextLine();

        System.out.print("Hello " + name);

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Your age is: " + age);

        System.out.println("Enter a decimal number: ");
        double decimal = scanner.nextDouble();

        System.out.println("Your decimal number is: " + decimal);

        System.out.println("Are you a programmer? (true/false): ");
        boolean isProgrammer = scanner.nextBoolean();

        System.out.println("You are a programmer: " + isProgrammer);

        scanner.close();
    }
}