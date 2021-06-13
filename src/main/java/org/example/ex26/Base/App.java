/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

/*
It can take a lot longer to pay off your credit card balance than you might realize. And the formula for figuring that out isn’t pretty. Hiding the formula’s complexity with a function can help you keep your code organized.

Write a program that will help you determine how many months it will take to pay off a credit card balance. The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment. The program should then return the number of months needed (rounded up to the next integer value).

The formula for this is

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

where

    n is the number of months.
    i is the daily rate (APR divided by 365).
    b is the balance.
    p is the monthly payment.
 */

package org.example.ex26.Base;

public class App {
    public static void main(String[] args) {
        UserInput newInput = new UserInput();
        PaymentCalculator calculateMonths = new PaymentCalculator();
        OutputString outputString = new OutputString();

        System.out.println("What is your balance?");
        double balance = newInput.getUserInput();

        System.out.println("What is the APR on the card (as a percent)?");
        double apr = newInput.getUserInput();

        System.out.println("What is the monthly payment you can make?");
        double monthlyPayment = newInput.getUserInput();

        double monthsToPayOff = calculateMonths.calculateMonthsUntilPaidOff(balance,apr,monthlyPayment);


        String finalString = outputString.genOutputString(monthsToPayOff);
        System.out.println(finalString);
    }
}
