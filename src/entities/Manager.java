package entities;

public class Manager extends Employee {
    //CONSTRUCTORS LIST
    public Manager(double salary, Department department) {
        super(salary, department);
    }

    //METHODS LIST
    @Override
    public double calculateAnnualSalary() {
        return getSalary() * 14 + getSalary() * 14 * 0.1; //Calculates the salary as a monthly pay plus 10% bonus per year
    }
}
