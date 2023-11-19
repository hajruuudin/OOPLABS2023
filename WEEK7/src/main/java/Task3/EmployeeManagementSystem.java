package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeManagementSystem {

    public List<Employee> filterEmployeesBySalary(ArrayList<Employee> listOfEmployees, double minSalary){
        return listOfEmployees.stream()
                .filter(employee -> employee.salary() >= minSalary).toList();
    }

    public double calculateSalary(ArrayList<Employee> listOfEmployees){
        double sum = 0;

        for(Employee employee : listOfEmployees){
            sum += employee.salary();
        }

        return sum;
    }

    public void displayEmployeeDetails(ArrayList<Employee> listOfEmployees){
        listOfEmployees.stream().forEach(employee -> System.out.println(employee));
    }
}
