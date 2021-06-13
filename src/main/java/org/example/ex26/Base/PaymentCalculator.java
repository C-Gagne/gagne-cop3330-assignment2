/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex26.Base;

public class PaymentCalculator {
    public Double calculateMonthsUntilPaidOff(double balance, double apr, double monthlyPayment)
    {

        double decimalAPR = apr/100;
        double dailyRate = decimalAPR/365;
        double roundedUpBalance = (Math.ceil(balance*100))/100;
        double roundedUpMonthlyPayment =  (Math.ceil(monthlyPayment*100))/100;

        double monthsToPayOff = Math.ceil((-(1.0/30.0) * Math.log(1 + (roundedUpBalance/roundedUpMonthlyPayment) * (1 - Math.pow(1 + dailyRate, 30))))/ Math.log(1 + dailyRate));

        return monthsToPayOff;
    }
}
