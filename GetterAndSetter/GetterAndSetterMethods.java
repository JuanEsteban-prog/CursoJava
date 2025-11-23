package GetterAndSetter;

public class GetterAndSetterMethods {
    public static void main(String[] args) {
        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field REDABLE
        // SETTERS = Methods that make a field WRITEABLE

        Car car = new Car("Charger", "Black", 10000);

        car.setColor("Red");
        car.setPrice(5000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
