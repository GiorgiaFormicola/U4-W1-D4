import entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FullTimeEmployee employee1 = new FullTimeEmployee(1300.00, Department.PRODUCTION);
        PartTimeEmployee employee2 = new PartTimeEmployee(10.00, Department.SALES);
        Manager employee3 = new Manager(1900.00, Department.ADMINISTRATION);

        Employee[] employeesList = {employee1, employee2, employee3};

        for (Employee currentEmployee : employeesList) {
            System.out.println("Employee serial number: " + currentEmployee.getSerialNumber());
            System.out.println("The annual employee salary is: " + currentEmployee.calculateAnnualSalary() + " euro");
        }

    }
}
