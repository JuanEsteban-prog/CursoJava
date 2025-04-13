import java.util.Scanner;

public class SearchingThroughAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String[] fruits = { "apple", "orange", "banana" };
        int target = 1;

        System.out.print("Enter a fruit to search for: ");
        String targetOne = scanner.nextLine();
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.print("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(targetOne)) {
                System.out.println("\nElement found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.print("Element not found in the array!");
        }

        scanner.close();
    }
}
