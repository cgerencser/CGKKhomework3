/*Copyright Erik Borchers and Chirs Gerenscer*/

package edu.elon.investment;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 *
 * @author erikborchers
 */
public class Investment implements Serializable {
 
  private double investmentAmt;
  private double yearlyIR;
  private int numberOfYears;
  private double futureValue;
  private double[] allVals;
          
  public Investment() {
    investmentAmt = 0.0;
    yearlyIR = 0.0;
    numberOfYears = 0;
    futureValue = 0.0;
  }
  
  public Investment(double investmentAmt, double yearlyIR, int numberOfYears, double futureValue) {
  
  this.investmentAmt = investmentAmt;
  this.yearlyIR = yearlyIR;
  this.numberOfYears = numberOfYears;
  this.futureValue = futureValue;
}
  /**
   * @return the investmentAmt
   */
  public double getInvestmentAmt() {
    return investmentAmt;
    
  }

  /**
   * @param investmentAmt the investmentAmt to set
   */
  public void setInvestmentAmt(double investmentAmt) {
    this.investmentAmt = investmentAmt;
  }

  /**
   * @return the yearlyIR
   */
  public double getYearlyIR() {
    return yearlyIR;
  }

  public double[] getAllVals(){
    getcalcFutureValue();
    return allVals;
    
  }
  
  /**
   * @param yearlyIR the yearlyIR to set
   */
  public void setYearlyIR(double yearlyIR) {
    this.yearlyIR = yearlyIR;
  }

  /**
   * @return the numberOfYears
   */
  public int getNumberOfYears() {
    return numberOfYears;
  }

  /**
   * @param numberOfYears the numberOfYears to set
   */
  public void setNumberOfYears(int numberOfYears) {
    this.numberOfYears = numberOfYears;
  }

  /**
   * @return the futureValue
   */
  public double getFutureValue() {
    return futureValue;
  }

  /**
   * @param futureValue the futureValue to set
   */
  public void setFutureValue(double futureValue) {
    this.futureValue = futureValue;
  }
  
  public void getcalcFutureValue(){
    double amt = this.investmentAmt;
    double interestRate = this.yearlyIR;
    int numYears = this.numberOfYears;
    allVals = new double[numYears];
    for (int i = 1; i <= numYears; i++) {
      amt = amt + (amt * (interestRate/100));
      allVals[i-1] = amt;
    }
   
    
  }
}
