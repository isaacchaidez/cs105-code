package edu.sbcc.cs105;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        
        ArrayList<Employee> emps = new ArrayList<>();
        Employee emp;
        emp = new Employee("12345", "Joe", LocalDate.now().minusYears(1), 57000);
        emps.add(emp);
        emp = new Employee("12346", "Julia", LocalDate.now().minusYears(10), 120000);
        emps.add(emp);
        emp = new Employee("12347", "Jasmin", LocalDate.now().minusDays(30), 62500);
        emps.add(emp);
        emp = new Employee("12348", "Jose", LocalDate.now().minusDays(29), 110000);
        emps.add(emp);
        emp = new Employee("12349", "Jontil", LocalDate.now().minusDays(31), 102000);
        emps.add(emp);
        emp = new Employee("12340", "Jack", LocalDate.now().minusDays(0), 99999);
        emps.add(emp);
        emp = new Employee("12345", "Jarrod", LocalDate.now().minusYears(6), 89000);
        emps.add(emp);

       EmployeeQuery newHireQuery = new NewHireQuery();
       newHireQuery.setDataSource(emps);

       EmployeeReport newHireReport = new EmployeeReport(newHireQuery);
       newHireReport.print(System.out);

       System.out.println();
       System.out.println();

       EmployeeQuery topEarnersQuery = new TopEarnersQuery();
       topEarnersQuery.setDataSource(emps);

       EmployeeReport topEarnersReport = new EmployeeReport(topEarnersQuery);
       topEarnersReport.print(System.out);

       
    }
}