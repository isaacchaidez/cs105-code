package edu.sbcc.cs105.p5;

/**
 * InterestPayment
 */
public class InterestPayment {

    private int paymentNo; 
    private double startingBalance; 
    private double interestEarned; 
    private double endBalance;

    public InterestPayment(
        int paymentNo, 
        double startingBalance, 
        double interestEarned, 
        double endBalance) {
       
        this.setPaymentNo(paymentNo);
        this.setStartingBalance(startingBalance);
        this.setInterestEarned(interestEarned);
        this.setEndBalance(endBalance);

    }

    /**
     * @return the endBalance
     */
    public double getEndBalance() {
        return endBalance;
    }

    /**
     * @param endBalance the endBalance to set
     */
    private void setEndBalance(double endBalance) {
        this.endBalance = endBalance;
    }

    /**
     * @return the interestEarned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * @param interestEarned the interestEarned to set
     */
    private void setInterestEarned(double interestEarned) {
        this.interestEarned = interestEarned;
    }

    /**
     * @return the startingBalance
     */
    public double getStartingBalance() {
        return startingBalance;
    }

    /**
     * @param startingBalance the startingBalance to set
     */
    private void setStartingBalance(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    /**
     * @return the paymentNo
     */
    public int getPaymentNo() {
        return paymentNo;
    }

    /**
     * @param paymentNo the paymentNo to set
     */
    private void setPaymentNo(int paymentNo) {
        this.paymentNo = paymentNo;
    }
}