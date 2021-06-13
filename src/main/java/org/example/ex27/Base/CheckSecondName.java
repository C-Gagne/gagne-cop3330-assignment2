/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex27.Base;

public class CheckSecondName {
    public String isSecondName(String secondName)
    {

        if (secondName == null)
            return "The second name must be filled in.\n";

        int strLength = secondName.length();

        if (strLength == 0)
            return "The second name must be filled in.\n";
        if (strLength == 1)
            return String.format("%s is not a valid second name. It is too short.\n", secondName);


        for (int i = 0; i < secondName.length(); i++)
        {
            char c = secondName.charAt(i);
            if (!Character.isLetter(c))
            {
                return String.format("%c is not a valid name character.\n", c);
            }
        }

        return "";
    }
}
