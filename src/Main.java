import entities.Department;
import entities.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1200.00, Department.PRODUCTION);
        Employee employee2 = new Employee(1800.00, Department.ADMINISTRATION);
        Employee employee3 = new Employee(1500, Department.SALES);

        Employee[] employeesList = {employee1, employee2, employee3};

        for (Employee currentEmployee : employeesList) {
            System.out.println("Employee serial number: " + currentEmployee.getSerialNumber());
        }
        
    }
}
