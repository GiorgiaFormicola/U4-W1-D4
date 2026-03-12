package entities;

public class Employee {
    private static int employeeAmount;
    //ATTRIBUTES LIST
    private int serialNumber;
    private double monthlySalary;
    private Department department;

    //CONSTRUCTORS LIST
    public Employee(double monthlySalary, Department department) {
        this.serialNumber = employeeAmount;
        this.monthlySalary = monthlySalary;
        this.department = department;
        employeeAmount++;
    }

    //GETTERS LIST
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public Department getDepartment() {
        return this.department;
    }

    //SETTERS LIST
    public void setDepartment(Department department) {
        this.department = department;
    }
}
