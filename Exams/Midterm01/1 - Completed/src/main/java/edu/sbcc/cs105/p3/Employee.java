package edu.sbcc.cs105.p3;

public class Employee {

    private String name;
    private double salary;
    private final int yearsOfService;
    private boolean salaryHasBeenRaised;

    public Employee(String name, double salary, int years) throws Exception {
        changeName(name);
        this.salary = salary;
        this.yearsOfService = years;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }


    /**
     * Accessor that returns the employee name
     * 
     * @return The employee name
     */
    public String getName() {
        return name;
    }

    /**
     * Changes the employee name
     * 
     * @param newName The new name - cannot exceed 25 characters
     * @throws Exception - When newName length exceeds 25 characters
     */
    public void changeName(String newName) throws Exception {

        if (newName.length() > 25) {
            throw new Exception("Name cannot be more than 25 characters in length");
            // return;
        }

        name = newName;
    }

    /**
     * Raises the salary by the provided percent.
     * 
     * @param byPercent The percentage by which to raise the salary (example: 6.0
     *                  for 6% instead of .06)
     * @throws Exception - When byPercent exceeds 6%
     */
    public void raiseSalary(double byPercent) throws Exception {

        if (salaryHasBeenRaised){
            throw new Exception("Salary has been raised already");
        }

        if (byPercent > 6) {
            throw new Exception("The raise percentage cannot exceed 6%");
        }
        double percentToRaise = byPercent / 100;

        salary = salary * (1 + percentToRaise);
        salaryHasBeenRaised = true;
        
    }

}