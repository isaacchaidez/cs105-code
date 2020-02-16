package edu.sbcc.cs105.p2;

public class EzTaxCalculator {

    private long taxesOwed;
    private long taxLiability;
    private TaxFiler taxFiler;
    private long standardDeduction;
    private long adjustedGrossIncome;

    public EzTaxCalculator(TaxFiler taxFiler) {
        

        this.taxFiler = taxFiler;

        setStandardDeduction();
        
        adjustedGrossIncome = Math.round(taxFiler.getTotalIncome() - standardDeduction);

		double taxRate = 0;

        switch (taxFiler.getTaxFilingStatus()) {
            
            case Single:
                taxRate = getSingleTaxRate();
                break;
        
            case MarriedFilingSeparately:
                taxRate = getMarriedFilingSeparatelyTaxRate();
                break;
        
            case HeadOfHousehold:
                taxRate = getHeadOfHouseHoldTaxRate();
                break;
        
            // Married Joint or Qualified Widow(er)
            default:
                taxRate = getMarriedJointOrQualifiedWidowerTaxRate();
                break;
        }

        taxLiability =  Math.round(this.taxFiler.getTotalIncome() * taxRate);
        taxesOwed = Math.round(taxLiability - taxFiler.getTaxWithheld());
    }

    private void setStandardDeduction() {

        if (taxFiler.getTaxFilingStatus() == TaxFilingStatus.Single){
            standardDeduction = 12200;

        } else if (taxFiler.getTaxFilingStatus() == TaxFilingStatus.HeadOfHousehold){
            standardDeduction = 18350;
            
        } else if (taxFiler.getTaxFilingStatus() == TaxFilingStatus.MarriedFilingSeparately){
            standardDeduction = 12200;
        } else{
            standardDeduction = 24400;
        }
    }

    private double getMarriedJointOrQualifiedWidowerTaxRate() {
        
        
        if (adjustedGrossIncome <= 19050){
            return .10;
        } 

        if (adjustedGrossIncome <= 77470){
            return .12;
        }

        if (adjustedGrossIncome <= 165000){
            return .22;
        }

        if (adjustedGrossIncome <= 315000){
            return .24;
        }

        if (adjustedGrossIncome <= 400000){
            return .32;
        }

        if (adjustedGrossIncome <= 600000){
            return .35;
        }

        return .37;
    }

    private double getHeadOfHouseHoldTaxRate() {
       
        
        if (adjustedGrossIncome <= 13600){
            return .10;
        } 

        if (adjustedGrossIncome <= 51800){
            return .12;
        }

        if (adjustedGrossIncome <= 82500){
            return .22;
        }

        if (adjustedGrossIncome <= 157500){
            return .24;
        }

        if (adjustedGrossIncome <= 200000){
            return .32;
        }

        if (adjustedGrossIncome <= 500000){
            return .35;
        }

        return .37;
    }

    private double getMarriedFilingSeparatelyTaxRate() {
        
        if (adjustedGrossIncome <= 9525){
            return .10;
        } 

        if (adjustedGrossIncome <= 38700){
            return .12;
        }

        if (adjustedGrossIncome <= 82500){
            return .22;
        }

        if (adjustedGrossIncome <= 157500){
            return .24;
        }

        if (adjustedGrossIncome <= 200000){
            return .32;
        }

        if (adjustedGrossIncome <= 300000){
            return .35;
        }

        return .37;

    }

    private double getSingleTaxRate() {
        
        if (adjustedGrossIncome <= 9525){
            return .10;
        } 

        if (adjustedGrossIncome <= 38700){
            return .12;
        }

        if (adjustedGrossIncome <= 82500){
            return .22;
        }

        if (adjustedGrossIncome <= 157500){
            return .24;
        }

        if (adjustedGrossIncome <= 200000){
            return .32;
        }

        if (adjustedGrossIncome <= 500000){
            return .35;
        }

        return .37;
    }

    public long getTaxesOwed() {
        return taxesOwed;
    }

    public long getTaxLiability(){
        return taxLiability;
    }
}