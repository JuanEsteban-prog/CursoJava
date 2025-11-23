package Inheritance;

public class Employee extends Person {
    int salary;

    Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + " " + this.last + " employee salary is: " + this.salary);
    }
}
