



# Problem 2 - EZ Tax Calculator

## Problem Context

You are creating a small program that will calculate federal taxes (please do not use this program for real or you may go to jail!)



### Class Diagram

![EZTax Calcualtor](/images/Midterm01 - EZTax Calculator.png)

### Concepts

TaxFiler - Represents info about the tax filer including wages, unemployment income, interest income, total income taxes paid, tax filing status, and dependency status

EZTaxCalculator - A class that calculates tax liability and taxes owed for a given TaxFiler



## Requirements



1. In the **edu.sbcc.cs105.p2** folder, create your code

2. Convert the UML class above to code. Names of the class, method, and parameters must all be correctly spelled including the case of the letters (upper / lower)

3. Implement the TaxFiler class.  This is a simple data class whose data is immutable after the object has been created. All of its data is provided to the constructor which initializes the instance variables. Getters are provided to return the invidividual tax filer components (e.g. income from wages). Note: totalIncome = wages + unemploymentCompensation + taxableInterest

4. Implement the EzTaxCalculator

   1. Constructor:  Use the constructor to calculate tax liability and taxes owed
      1. Taxes liability calculation - Tax liability is the original amount owed based upon income minus their standard deduction (no itemized deductions!)
         1. Determine the standard deduction based upon their tax filing status using  Table A below:
         2. Determine the filer's adjusted gross income (AGI) :  **AGI = Total Income - Standard Deduction**
         3. Determine their tax rate based upon their **AGI** using the correct Table B below:
         4. Calculate their tax liability:  **taxLiability = AGI * taxRate**
      2. Taxes owed calculation:  **taxesOwed = taxLiability - taxesPaid**.  A negative amount implies a refund is due
   2. Accessor (get) methods should simply return values calculated in constructor method.

5. Put any client code to test in Problem2.java **run** method.

6. Code must compile to get some credit

   

   

### Table A - Standard Deduction

| Tax Filing Status                    | **Standard Deduction** |
| ------------------------------------ | ---------------------- |
| Single or Married Filing Separately  | 12,200                 |
| Head of Household                    | 18,350                 |
| Married or Qualified Widow / Widower | 24,400                 |



### Tables B:  Tax Rates

#### B1 -Single Or Married Filing Jointly / Qualified Widow(er)

| Tax Rate | Taxable Income (Single) | Taxable Income (Married Filing Jointly / Qualified Widow(er)) |
| :------- | :---------------------- | :----------------------------------------------------------- |
| 10%      | Up to $9,525            | Up to $19,050                                                |
| 12%      | $9,526 to $38,700       | $19,051 to $77,400                                           |
| 22%      | $38,701 to $82,500      | $77,401 to $165,000                                          |
| 24%      | $82,501 to $157,500     | $165,001 to $315,000                                         |
| 32%      | $157,501 to $200,000    | $315,001 to $400,000                                         |
| 35%      | $200,001 to $500,000    | $400,001 to $600,000                                         |
| 37%      | Over $500,000           | Over $600,000                                                |

#### B2 - Married Filing Jointly or Head of Household 

| Tax Rate | Taxable Income (Married Filing Separately) | Taxable Income (Head of Household) |
| :------- | :----------------------------------------- | :--------------------------------- |
| 10%      | Up to $9,525                               | Up to $13,600                      |
| 12%      | $9,526 to $38,700                          | $13,601 to $51,800                 |
| 22%      | $38,701 to $82,500                         | $51,801 to $82,500                 |
| 24%      | $82,501 to $157,500                        | $82,501 to $157,500                |
| 32%      | $157,501 to $200,000                       | $157,501 to $200,000               |
| 35%      | $200,001 to $300,000                       | $200,001 to $500,000               |
| 37%      | Over $300,000                              | Over $500,000                      |