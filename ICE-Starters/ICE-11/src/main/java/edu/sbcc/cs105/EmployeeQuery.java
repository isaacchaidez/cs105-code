package edu.sbcc.cs105;

import java.util.ArrayList;

public interface EmployeeQuery {
    String getQueryTitle();    
    ArrayList<Employee> run();
    void setDataSource(ArrayList<Employee> employeeList);
}