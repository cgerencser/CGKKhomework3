/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.investment;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author erikborchers
 */
public class Investment implements Serializable {
 
  private double investmentAmt;
  private double yearlyIR;
  private double numberOfYears;
  private double futureValue;
          
  public Investment() {
    investmentAmt = 0.0;
    yearlyIR = 0.0;
    numberOfYears = 0.0;
    futureValue = 0.0;
  }
  
  public Investment(double investmentAmt, double yearlyIR, double numberOfYears, double futureValue) {
  
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

  /**
   * @param yearlyIR the yearlyIR to set
   */
  public void setYearlyIR(double yearlyIR) {
    this.yearlyIR = yearlyIR;
  }

  /**
   * @return the numberOfYears
   */
  public double getNumberOfYears() {
    return numberOfYears;
  }

  /**
   * @param numberOfYears the numberOfYears to set
   */
  public void setNumberOfYears(double numberOfYears) {
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
  
  public double calcFutureValue(){
    double amt = this.investmentAmt;
    double interestRate = this.yearlyIR;
    double numYears = this.numberOfYears;
    for (int i = 1; i <= numYears; i++) {
      amt = amt + (amt * (interestRate/100));
    }
    BigDecimal bd = new BigDecimal(amt);
    bd = bd.setScale(2, RoundingMode.HALF_UP);
    amt = bd.doubleValue();  
    return amt;
  }
}
