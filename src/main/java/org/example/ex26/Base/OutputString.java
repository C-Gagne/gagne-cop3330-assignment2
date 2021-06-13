/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex26.Base;

public class OutputString {
    public String genOutputString(double monthsToPayOff)
    {
        return String.format("It will take %.0f months to pay of your credit card.", monthsToPayOff);
    }
}
