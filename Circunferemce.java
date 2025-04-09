import java.util.Scanner;

public class Circunferemce {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's do a program to calculate the Circumference, area and volume of a circle !!!");
        System.out.println("What is the radius of the circle?");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of the circle is: " + circumference);

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circumference is: " + area);

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of the circumference is: " + volume);

        scanner.close();
    }
}
