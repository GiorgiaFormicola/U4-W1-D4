package entities;

public abstract class Employee {
    //ATTRIBUTES LIST
    private static int employeeAmount;

    private int serialNumber;
    private double salary;
    private Department department;

    //CONSTRUCTORS LIST
    public Employee(double salary, Department department) {
        this.serialNumber = employeeAmount;
        this.salary = salary;
        this.department = department;
        employeeAmount++;
    }

    //METHODS LIST
    public abstract double calculateAnnualSalary();

    //GETTERS LIST
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public Department getDepartment() {
        return this.department;
    }

    //SETTERS LIST
    public void setDepartment(Department department) {
        this.department = department;
    }
}
