public class VariableArguments {
    public static void main(String[] args) {
        // Variable arguments = varargs = allow a method to accept a varying # of
        // arguments makes methods more flexible, no need for overloaded methods java
        // will pack the arguments into an array...... (ellipsis)
        System.out.println(add(1, 2, 3, 4, 5, 6));
        System.out.println(average(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }

    static double average(double... characters) {
        double sum = 0;

        if (characters.length == 0) {
            return 0;
        }

        for (double character : characters) {
            sum += character;
        }
        return sum / characters.length;
    }

    static int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
