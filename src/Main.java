import entities.*;
import interfaces.Worker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Employee employee1 = new Employee(1300.00, Department.PRODUCTION);
        Employee employee2 = new Employee(10.00, Department.SALES);
        Employee employee3 = new Employee(1900.00, Department.ADMINISTRATION);*/

        FullTimeEmployee employee1 = new FullTimeEmployee(1300.00, Department.PRODUCTION);
        PartTimeEmployee employee2 = new PartTimeEmployee(10.00, Department.SALES);
        Manager employee3 = new Manager(1900.00, Department.ADMINISTRATION);

        Employee[] employeesList = {employee1, employee2, employee3};

        double salariesSum = 0;

        for (Employee currentEmployee : employeesList) {
            System.out.println("Employee serial number: " + currentEmployee.getSerialNumber());
            System.out.println("The annual employee salary is: " + currentEmployee.calculateAnnualSalary() + " euro");
            salariesSum += currentEmployee.calculateAnnualSalary();
        }

        System.out.println("The sum of all salaries is: " + salariesSum + " euro");

        Volunteer volunteer1 = new Volunteer("Marco", 30, true);
        Volunteer volunteer2 = new Volunteer("Giacomo", 44, false);
        Volunteer volunteer3 = new Volunteer("Stefania", 35, true);

        Worker[] workersList = {employee1, employee2, volunteer1, volunteer2, employee3, volunteer3};

        for (Worker currentWorker : workersList) {
            currentWorker.checkIn();
        }

        /*for (Worker currentWorker : workersList) {
            if (currentWorker instanceof Employee) {
                Employee currentEmployee = (Employee) currentWorker;
                System.out.println("Employee serial number: " + currentEmployee.getSerialNumber());
                System.out.println("The annual employee salary is: " + currentEmployee.calculateAnnualSalary() + " euro");
                currentEmployee.checkIn();
            } else {
                currentWorker.checkIn();
            }
        }*/


    }
}
