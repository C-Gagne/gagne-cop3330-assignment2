/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex31.Base;

public class InputValidator
{
    public boolean validateInput(String isNumber)
    {
        int decimalCount = 0;

        if (isNumber.length()>3)
        { return false; }
        if (isNumber.length()==0)
        { return false; }

        for (int i = 0; i < isNumber.length(); i++)
        {
            if ((isNumber.charAt(i) == '.') && decimalCount == 0)
            {
                decimalCount++;
            }
            else if (!Character.isDigit(isNumber.charAt(i)))
            { return false; }
        }
        return true;
    }
}
