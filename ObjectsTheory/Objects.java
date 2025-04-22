package ObjectsTheory;

public class Objects {
    public static void main(String[] args) {
        // Object = An entity that holds data (Attributes) and perform actions (methods)
        // It is a reference data type

        Car car = new Car();

        car.isRunning = true;

        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();

        // Every car that we make have the same attributes and the same methods

    }
}
