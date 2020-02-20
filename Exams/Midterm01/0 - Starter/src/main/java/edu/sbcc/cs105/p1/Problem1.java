package edu.sbcc.cs105.p1;

import edu.sbcc.cs105.IProblem;

/**
 * Problem1
 */
public class Problem1 implements IProblem {

    public void run(){
      RetirementCalculator calc = new RetirementCalculator(59, 30, 90600);

        System.out.printf("The employee will receive %,4.2f / monthy or %,4.2f annually. This is %.2f%% of their employment income", 
        calc.getMontlyRetirementBenefit(), 
        calc.getAnnualRetirementBenefit(),
        calc.getRetirementPercentage());
        
    }
}
