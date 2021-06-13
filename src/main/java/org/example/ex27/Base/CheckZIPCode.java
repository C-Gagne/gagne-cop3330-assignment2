/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex27.Base;

public class CheckZIPCode {
    public String isZip(String zipCode)
    {

        if (zipCode == null)
            return "The ZIP code must be filled in.\n";

        int strLength = zipCode.length();

        if (strLength == 0)
            return "The ZIP code must be filled in.\n";
        if (strLength != 5)
            return String.format("%s is not a valid ZIP code.\n", zipCode);


        for (int i = 0; i < zipCode.length(); i++)
        {
            char c = zipCode.charAt(i);
            if (!Character.isDigit(c))
            {
                return String.format("%c is not a number.\n", c);
            }
        }

        return "";
    }
}
