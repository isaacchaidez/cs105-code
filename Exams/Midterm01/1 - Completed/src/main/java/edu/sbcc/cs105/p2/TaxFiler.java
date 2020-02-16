package edu.sbcc.cs105.p2;

/**
 * TaxFiler
 */
public class TaxFiler {

    private long totalIncome;
    private long taxWithheld;
    private double wages;
    private double taxableInterest;
    private double unemploymentCompensation;   
    private boolean isSomeoneElsesDependent;
    private TaxFilingStatus taxFilingStatus;
     
    public TaxFiler(
        TaxFilingStatus taxFilingStatus, 
        boolean isSomeoneElsesDependent, 
        double wages,
        double taxableInterest, 
        double unemploymentCompensation, 
        double taxWithheld) {

            this.taxFilingStatus = taxFilingStatus;
            this.totalIncome =  Math.round(wages + taxableInterest + unemploymentCompensation);
            this.taxWithheld =  Math.round(taxWithheld);
            this.isSomeoneElsesDependent = isSomeoneElsesDependent;
    }

    public TaxFilingStatus getTaxFilingStatus() {
        return taxFilingStatus;
    }

    public boolean isSomeoneElsesDependent() {
        return isSomeoneElsesDependent;
    }

    public long getTotalIncome(){
        return totalIncome;
    }

    public long getTaxWithheld() {
        return taxWithheld;
    }

    public double getWages(){
        return wages;
    }

    public double getTaxableInterest(){
        return taxableInterest;
    }

    public double getUnemploymentCompensation() {
        return unemploymentCompensation;
    }

    
}