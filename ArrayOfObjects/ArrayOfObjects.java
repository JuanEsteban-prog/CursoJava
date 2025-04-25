package ArrayOfObjects;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Black");
        Car car3 = new Car("Charger", "Yellow");

        // Car[] cars = { car1, car2, car3 };
        Car[] cars = { new Car("Mustang", "Red"),
                new Car("Corvette", "Black"),
                new Car("Charger", "Yellow") }; // Anonymous objects

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        for (Car car : cars) {
            car.color = "black";
        }
        for (Car car : cars) {
            car.drive();
        }
    }
}
