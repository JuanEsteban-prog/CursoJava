package ConstructorTheory;

public class Constructor {
    public static void main(String[] args) {
        // constructor = A special method to initialize objects, You can pass arguments
        // to a constructor and set up initial values.

        Student student1 = new Student("Spongebob", 30, 3.9, true);
        Student student2 = new Student("Patrick", 34, 1.4, false);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

    }
}
