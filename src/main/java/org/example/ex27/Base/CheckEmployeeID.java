/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex27.Base;

public class CheckEmployeeID {
    public String isID(String employeeID)
    {

        if (employeeID == null)
            return "The employee ID must be filled in.\n";

        int strLength = employeeID.length();

        if (strLength == 0)
            return "The employee ID must be filled in.\n";
        if (strLength != 7)
            return String.format("%s is not a valid ID.\n", employeeID);


        for (int i = 0; i < employeeID.length(); i++)
        {
            if (i == 0 && !Character.isLetter(employeeID.charAt(i)))
            {
                return String.format("%s is not a valid ID.\n", employeeID);
            }
            else if (i == 1 && !Character.isLetter(employeeID.charAt(i)))
            {
                return String.format("%s is not a valid ID.\n", employeeID);
            }
            else if (i == 2 && employeeID.charAt(i) != '-')
            {
                return String.format("%s is not a valid ID.\n", employeeID);
            }
            else if (i > 2 && !Character.isDigit(employeeID.charAt(i)))
            {
                return String.format("%s is not a valid ID.\n", employeeID);
            }
        }

        return "";
    }
}
