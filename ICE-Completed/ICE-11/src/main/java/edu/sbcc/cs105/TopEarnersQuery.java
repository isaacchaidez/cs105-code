package edu.sbcc.cs105;

import java.util.ArrayList;

/**
 * TopEarnersQuery
 */
public class TopEarnersQuery implements EmployeeQuery {

    private ArrayList<Employee> employeeList;

    @Override
    public String getQueryTitle() {
        return "Top Earners";
    }

    @Override
    public ArrayList<Employee> run() {
              
        ArrayList<Employee> result = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (employee.getSalary() >= 100000){
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