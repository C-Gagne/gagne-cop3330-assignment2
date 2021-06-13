/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex29.Base;

public class OutputString {
    public String genOutputString(double yearsToDoubleReturn)
    {
        return String.format("It will take %.0f years to double your initial investment.", yearsToDoubleReturn);
    }
}
