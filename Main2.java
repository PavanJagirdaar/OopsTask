/*Define a base class person with attributes name and age.
create a subclass employee inherits from person and adds attributes like  employeeID and salary.
use  the super to initialize the person attributes in the employee constructor.*/
package oopstask2;

class Person{
    protected String name;
    protected int age;

    // Constructor for the base class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

class Employee extends Person {
    private int employeeID;
    private double salary;

    // Constructor for the subclass using super to initialize person attributes
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getter for employeeID
    public int getEmployeeID() {
        return employeeID;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("John Doe", 30, 12345, 50000.0);

        // Accessing attributes from the base class
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());

        // Accessing attributes from the subclass
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Salary: " + employee.getSalary());
    }
}

