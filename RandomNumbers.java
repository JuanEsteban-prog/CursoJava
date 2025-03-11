import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int numberOne;
        int numberTwo;
        int numberThree;

        // we can specify the range of the random numbers that we want, for this we have
        // to do the following
        // number = random.nextInt(inclusive,exclusive);
        numberOne = random.nextInt(1, 6);
        numberTwo = random.nextInt(1, 6);
        numberThree = random.nextInt(1, 6);

        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);

        double decimalNumberOne;
        double decimalNumberTwo;
        double decimalNumberThree;

        decimalNumberOne = random.nextDouble(0, 1);
        decimalNumberTwo = random.nextDouble(0, 1);
        decimalNumberThree = random.nextDouble(0, 1);

        System.out.println(decimalNumberOne);
        System.out.println(decimalNumberTwo);
        System.out.println(decimalNumberThree);

        boolean isHeads;

        isHeads = random.nextBoolean();
        if (isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
