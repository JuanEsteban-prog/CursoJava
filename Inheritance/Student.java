package Inheritance;

public class Student extends Person {
    double GPA;

    Student(String first, String last, double GPA) {
        super(first, last);
        this.GPA = GPA;
    }

    void showGPA() {
        System.out.println(this.first + " " + this.last + "'s GPA is: " + this.GPA);
    }
}
