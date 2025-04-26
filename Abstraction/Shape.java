package Abstraction;

public abstract class Shape {
    abstract double area(); // ABSTRACT method

    void display() { // CONCRETE METHOD
        System.out.println("This is a shape");
    }
}
