package edu.sbcc.cs105;

import java.time.LocalDate;


/**
 * Employee
 */
public class Employee {

    private final String employeeId;
    private final String name;
    private final LocalDate hireDate;
    private final double salary;

    public Employee(String employeeId, String name, LocalDate hireDate, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }


}