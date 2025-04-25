package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // Inheritance = One class inherits the atributs and methods from another class.
        // child <- Parent <- Grandparent
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);
        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.speak();
        cat.speak();
        plant.photosynthesize();
    }
}
