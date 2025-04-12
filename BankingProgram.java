import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    int usersChoice;

    public static void main(String[] args) {
        mainMenu();
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    static double deposit() {
        double amount;
        System.out.print("Enter an amount to the be deposited: ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }

    }

    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }

    static void mainMenu() {
        double balance = 0;
        boolean isRunning = true;
        int usersChoice;

        while (isRunning) {

            System.out.println("***************");
            System.out.println("Banking program");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice: ");
            usersChoice = scanner.nextInt();

            switch (usersChoice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;

                default -> System.out.println("INVALID CHOICE!");
            }
        }

        System.out.println("**************************");
        System.out.println("Thank you!Have a nice day!");
        System.out.println("**************************");
    }
}
