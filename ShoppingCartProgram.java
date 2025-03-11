import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productToBuy;
        double productPrice;
        int productQuantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        productToBuy = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        productPrice = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        productQuantity = scanner.nextInt();

        System.out.print("\n You have bought: " + productQuantity + " " + productToBuy + "/s");

        total = productPrice * productQuantity;
        System.out.print("The total price is: " + currency + total);

        scanner.close();
    }
}
