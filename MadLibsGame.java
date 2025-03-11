import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjectiveOne;
        String nounOne;
        String adjectiveTwo;
        String verbOne;
        String adjectiveThree;

        System.out.print("Enter and adjective(description): ");
        adjectiveOne = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        nounOne = scanner.nextLine();
        System.out.print("Enter and adjective(description): ");
        adjectiveTwo = scanner.nextLine();
        System.out.print("Enter a verb with an -ing (action): ");
        verbOne = scanner.nextLine();
        System.out.print("Enter and adjective(description): ");
        adjectiveThree = scanner.nextLine();

        System.out.println("\nLet's play Mad Libs!!! ");
        System.out.println("\nToday I went to a " + adjectiveOne + " zoo.");
        System.out.println("In an exhibit I saw a " + nounOne + ".");
        System.out.println(nounOne + " was " + adjectiveTwo + " and " + verbOne + ".");
        System.out.println("I was " + adjectiveThree + ".");

        scanner.close();
        // \n creates a new line character.
    }
}
