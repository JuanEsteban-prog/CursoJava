
public class Arrays {
    public static void main(String[] args) {
        // array = a collection of values of the same data type *think of it as a
        // variable that can store more than 1 value*

        String[] fruits = { "apple", "orange", "banana", "coconut" };
        fruits[0] = "pineapple";

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);
        System.out.println(fruits[0]);
        for (int i = 0; i < numOfFruits; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println();
        // enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // to sort(classify the ARRAY)
        // Arrays.sort(fruits);
        // Arrays.fill(fruits, "pineapples");
    }
}
