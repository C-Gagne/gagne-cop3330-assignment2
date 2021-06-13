/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex25.Base;

public class OutputString {
    public String genOutputString(int passwordStrength)
    {
        if (passwordStrength == 0)
        {
            return "Your password is very weak.";
        }
        if (passwordStrength == 1)
        {
            return "Your password is weak.";
        }
        if (passwordStrength == 2)
        {
            return "Your password is strong.";
        }
        if (passwordStrength == 3)
        {
            return "Your password is very strong.";
        }
        else
            return "Error.";
    }
}
