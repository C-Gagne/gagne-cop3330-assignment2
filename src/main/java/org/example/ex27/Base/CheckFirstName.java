/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex27.Base;

public class CheckFirstName {
    public String isFirstName(String firstName)
    {

        if (firstName == null)
            return "The first name must be filled in.\n";

        int strLength = firstName.length();

        if (strLength == 0)
            return "The first name must be filled in.\n";
        if (strLength == 1)
            return String.format("%s is not a valid first name. It is too short.\n", firstName);


        for (int i = 0; i < firstName.length(); i++)
        {
            char c = firstName.charAt(i);
            if (!Character.isLetter(c))
            {
                return String.format("%c is not a valid name character.\n", c);
            }
        }

        return "";
    }
}
