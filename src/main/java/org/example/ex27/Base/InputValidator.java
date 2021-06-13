/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex27.Base;

public class InputValidator
{
    public String validateInput(String firstName, String secondName, String zipCode, String employeeID)
    {
        CheckFirstName checkFirstName = new CheckFirstName();
        CheckSecondName checkSecondName = new CheckSecondName();
        CheckZIPCode checkZIPCode = new CheckZIPCode();
        CheckEmployeeID checkEmployeeID = new CheckEmployeeID();

        String listErrors = "";

        listErrors += checkFirstName.isFirstName(firstName);
        listErrors += checkSecondName.isSecondName(secondName);
        listErrors += checkZIPCode.isZip(zipCode);
        listErrors += checkEmployeeID.isID(employeeID);

        if (listErrors.length()==0)
        {
            return "There were no errors found.";
        }

        else return listErrors;
    }
}
