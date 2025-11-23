package Inheritance;

public class SuperInheritance {
    // super = Refers to the parent class (subclass <- superclass)
    // Used in constructors and method overriding
    // Calls the parent constructor to initialize inherited attributes

    public static void main(String[] args) {

        Person person = new Person("Joe", "Mama");
        person.showName();

        Student student = new Student("Big", "Chungus", 3.8);
        student.showName();
        student.showGPA();

        Employee employee = new Employee("David", "Laid", 5000);
        employee.showName();
        employee.showSalary();
    }
}
