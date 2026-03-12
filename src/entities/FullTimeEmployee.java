package entities;

public class FullTimeEmployee extends Employee {
    //CONSTRUCTORS LIST
    public FullTimeEmployee(double salary, Department department) {
        super(salary, department);
    }

    //METHODS LIST
    @Override
    public double calculateAnnualSalary() {
        return getSalary() * 14; //Calculates the salary as a monthly pay
    }


}
