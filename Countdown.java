import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to countdown form?: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);// Generates a little bit of delay between numbers, in order for it to work we
                               // have to add "throws InterruptedException" next to the main class
        }
        System.out.println("Happy new year!");

        scanner.close();
    }
}
