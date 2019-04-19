/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loan;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author husseinjabbar
 */
@Named(value = "loanController")
@SessionScoped
public class LoanController implements Serializable {

    private double loanAmount;
    private double annualInterestRate;
    private double monthlyInterestRate;
    private double numberOfYears;
    private double monthlyPayment;
    private double totalPayment;
    
    public double calcMonthly(){
        monthlyInterestRate = annualInterestRate / 1200;
         monthlyPayment = loanAmount * monthlyInterestRate / (1
      - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        return monthlyPayment;
    }
    
    public double calcTotal(){
        totalPayment = monthlyPayment * numberOfYears * 12;
        return totalPayment;   
    }
    
    public void reset(){
        setLoanAmount(0);
        setAnnualInterestRate(0);
        setNumberOfYears(0);
    }
    

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public double getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(double numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
    
    public LoanController() {
    }
    
}
