/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex29.Base;

public class InputValidator
{
    public boolean validateInput(String returnRate)
    {
        int decimalCount = 0;

        if (returnRate.length()>3)
        { return false; }
        if (returnRate.length()==0)
        { return false; }

        for (int i=0; i < returnRate.length(); i++)
        {
            if (returnRate.charAt(0) == '0' && returnRate.length()==1)
            { return false; }
            else if ((returnRate.charAt(i) == '.') && decimalCount == 0)
            {
                decimalCount++;
            }
            else if (!Character.isDigit(returnRate.charAt(i)))
            { return false; }
        }
        return true;
    }
}
