package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();

        listOfEmployees.add(new Employee(1, "David", 34.5));
        listOfEmployees.add(new Employee(2, "John", 14.7));
        listOfEmployees.add(new Employee(3, "Svetlana", 40.0));
        listOfEmployees.add(new Employee(4, "Alex", 23));

        System.out.println(ems.filterEmployeesBySalary(listOfEmployees, 20.0));
        ems.displayEmployeeDetails(listOfEmployees);

        System.out.println(ems.calculateSalary(listOfEmployees));
    }
}
