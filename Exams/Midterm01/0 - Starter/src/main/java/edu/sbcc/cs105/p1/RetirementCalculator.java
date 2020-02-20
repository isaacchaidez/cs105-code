package edu.sbcc.cs105.p1;

import java.math.BigDecimal;
import java.math.RoundingMode;


 RetirementCalculator

public class RetirementCalculator {

    private int age;
    private int yearsOfService;
    private double finalMonthlyCompensation;

    /**
     * Constructs a new SalaryCalculator
     * 
     * @param age  The whole number age of the employee at retirement (no rounding)
     * @param yearsOfService The whole number of years of service (no rounding)
     * @param finalAnnualCompensation The annual compensation of the employee at retirement
     */
    public RetirementCalculator(int age, int yearsOfService, double finalAnnualCompensation) {
        this.age = age;
        this.yearsOfService = yearsOfService;
        this.finalMonthlyCompensation = finalAnnualCompensation / 12;
    }

    /**
     * Calculates and returns the monthly retirement benefit of the employee based upon their age, years of service credit, and final monthly compensation
     * 
     * @return The calculated monthly retiremement benefit of the employee
     */
    public double getMontlyRetirementBenefit(){

        double retirementBenefit = 0;

        // Service Credit * age factor * final compensation
        retirementBenefit = yearsOfService * getAgeFactor(age) / 100 * finalMonthlyCompensation;

        BigDecimal roundedRetirementBenefit = new BigDecimal(retirementBenefit).setScale(2, RoundingMode.HALF_UP);
        return roundedRetirementBenefit.doubleValue();

    }

    /**
     * Calculates and returns the annual retirement benefit of the employee based upon their age, years of service credit, and final monthly compensation
     * 
     * @return The calculated annual retiremement benefit of the employee
     */
    public double getAnnualRetirementBenefit(){
        return getMontlyRetirementBenefit() * 12;
    }

    /**
     * Calculates and returns the percentage of the final compensation based upon 
     * Years of Service Credit * Age Factor
     * 
     * @return the percentage of the employee's final monthly compensation at retirement they will receive as a retirement beneift
     */
    public double getRetirementPercentage(){
        return yearsOfService * getAgeFactor(age);
    }

    /**
     * Calculates and returns the age factor used in the compensation formula
     * 
     * @param age The age of the employee (whole number) at retirement
     * @return The age factor lookup for the 2% at 60 plan
     */
    private double getAgeFactor(int age){

        double ageFactor;

        if (age >= 63){
            ageFactor = 2.4;
        } 
        else if (age == 62){
            ageFactor = 2.267;
        } 
        else if (age == 61){
            ageFactor = 2.133;
        }
        else if (age >= 55){
            ageFactor = 1.4 + .12 * (age - 55);
        }
        else
        {
            // Not eligible
            ageFactor = 0;
        }

        return ageFactor;
    }
}
