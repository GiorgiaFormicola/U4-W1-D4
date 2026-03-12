package entities;

public class PartTimeEmployee extends Employee {
    //CONSTRUCTORS LIST
    public PartTimeEmployee(double salary, Department department) {
        super(salary, department);
    }

    //METHODS LIST
    @Override
    public double calculateAnnualSalary() {
        return getSalary() * 26 * 52; //Calculates the salary as an hourly pay
    }


}
