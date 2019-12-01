package edu.sbcc.cs105;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * NewHireQuery
 */
public class NewHireQuery implements EmployeeQuery {

    private ArrayList<Employee> employeeList;

    @Override
    public String getQueryTitle() {

        return "New Hire Query";
    }

    @Override
    public ArrayList<Employee> run() {
        
        ArrayList<Employee> result = new ArrayList<>();

        LocalDate thirtyDaysAgo = LocalDate.now().minusDays(30);
        for (Employee employee : employeeList) {
            if (employee.getHireDate().compareTo(thirtyDaysAgo) >= 0){
                result.add(employee);
            }
        }

        return result;
    }

    @Override
    public void setDataSource(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
       
    }

    
}