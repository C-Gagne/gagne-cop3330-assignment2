/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex29.Base;

public class YearsToDoubleReturn
{
    public Double calculateYearsToDoubleReturn(String returnRate)
    {
        Double returnRateAsDouble = Double.parseDouble(returnRate);
        return Math.ceil((72/returnRateAsDouble));
    }
}
