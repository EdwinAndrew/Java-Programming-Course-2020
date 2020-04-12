/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edwinandrew
 */
public class Debt {
    private double initialBalance;
    private double initialInterestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.initialBalance = initialBalance;
        this.initialInterestRate = initialInterestRate;
    }

    public void printBalance(){
        System.out.println(initialBalance);
    }

    public void waitOneYear(){
        initialBalance = initialBalance * initialInterestRate;
    }
}
