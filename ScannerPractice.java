import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        // Scanner = object that allows us to accept user input.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a programmer? (true/false): ");
        boolean isProgrammer = scanner.nextBoolean();

        System.out.print("Hello " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your GPA is : " + gpa);

        if (isProgrammer) {
            System.out.println("Congratulation you are a programmer");
        } else {
            System.out.println("LOL, you are not a programmer HAHAHAHA");
        }

        scanner.close();
    }
    // COMMON ERRORS
    // System.out.println("Enter your age: ");
    // int age = scanner.nextInt();

    // System.out.println("Enter your favorite color: ");
    // String color = scanner.nextLine();
    // This will not work because the nextLine() method will read the newline
    // character in the input buffer and return the rest of the line.

    // To fix this, you can add an extra scanner.nextLine() method to consume the
    // newline character before calling the nextLine() method to read the color
    // input.

    // System.out.println("Enter your age: ");
    // int age = scanner.nextInt();
    // scanner.nextLine(); // Consume newline character

    // System.out.println("Enter your favorite color: ");
    // String color = scanner.nextLine()
}