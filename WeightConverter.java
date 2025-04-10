import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1: Convert lbs to kg");
        System.out.println("2: Convert kg to lbs");

        System.out.print("Choice an option: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kg is: %.2f kgs", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight in kg: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.25;
            System.out.printf("The new weight in lbs is: %.2f lbs", newWeight);
        } else {
            System.out.println("That was not a valid choice");
        }

        scanner.close();
    }
}
