import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperature;
        double newTemperature;
        String unit;

        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemperature = (unit.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 9 / 5) + 32;
        System.out.printf("The temperature is: %.2f %s", newTemperature, unit);

        scanner.close();
    }
}
