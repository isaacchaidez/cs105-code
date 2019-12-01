package edu.sbcc.cs105;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * EmployeeReport
 */
public class EmployeeReport {

    private EmployeeQuery query;

    public EmployeeReport(EmployeeQuery query) {
        this.query = query;
        
    }

    public void print(PrintStream out){

        out.println(query.getQueryTitle());
        ArrayList<Employee> reportPopulation = query.run();
        for (Employee emp : reportPopulation) {
            out.printf("%s, %s, %tD, $%.2f%n", 
                emp.getName(),
                emp.getEmployeeId(), 
                emp.getHireDate(), 
                emp.getSalary());
        }
        
    }
}