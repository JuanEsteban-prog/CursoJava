import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random Random = new Random();

        int guessedNumber;
        int numberToGuess;
        int attempts = 0;
        int maxNumber = 100;
        int minNumber = 1;

        System.out.println("Number Guessing Game!");
        System.out.printf("Select a number between %d - %d: \n", minNumber, maxNumber);

        numberToGuess = Random.nextInt(minNumber, maxNumber + 1);

        do {
            System.out.print("Enter a guess: ");
            guessedNumber = scanner.nextInt();
            attempts++;

            if (guessedNumber > numberToGuess) {
                System.out.println("TOO HIGH!");
                System.out.print("Try again: ");
            } else if (guessedNumber < numberToGuess) {
                System.out.println("TO SMALL!");
                System.out.print("Try again: ");
            } else {
                System.out.println("Correct!, the number was: " + numberToGuess + " and you guessed it in " + attempts
                        + " attempts");
            }
        } while (guessedNumber != numberToGuess);
        scanner.close();
    }
}
