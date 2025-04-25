package Super;

public class Super {
    public static void main(String[] args) {
        // super = Refers to the parent class (Subclass <- Superclass).
        // Used in constructors and method overriding.
        // Calls the parent constructor to initialize attributes.

        Person person = new Person("Tom", "Riddle");
        person.showName();

        Student student = new Student("Harry", "Maguire", 3.4);
        student.showGPA();

        Employee employee = new Employee("Leonel", "Messi", 50000);
        employee.showSalary();
    }
}
