import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first side: ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter the length of the second side: ");
        double sideB = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        System.out.println("The hypotenuse is: " + hypotenuse);

        scanner.close();
    }
}
