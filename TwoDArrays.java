public class TwoDArrays {
    public static void main(String[] args) {
        // 2D array = An array where each element is an array, it is useful for storing
        // a matrix of data.
        String[][] groceries = { { "apple", "orange", "banana" },
                { "potato", "onion", "carrot" },
                { "chicken", "pork", "beef", "fish" } };

        groceries[0][0] = "pineapple";
        groceries[1][0] = "celery";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
