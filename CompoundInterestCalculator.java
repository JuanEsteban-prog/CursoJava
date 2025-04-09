import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Let's calculate the compound interest!");

        System.out.print("Tell me your principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Tell me the rate of interest in %: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Tell me the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Tell me the # of years:  ");
        years = scanner.nextInt();

        amount = principal * (Math.pow(1 + rate / timesCompounded, timesCompounded * years));
        System.out.print("The amount after " + years + " is " + amount);

        scanner.close();
    }
}
