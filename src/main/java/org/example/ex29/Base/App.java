/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex29.Base;

public class App
{
    public static void main(String[] args)
    {
        UserInput newInput = new UserInput();
        InputValidator validateInput = new InputValidator();
        YearsToDoubleReturn calcYearsToDoubleReturn = new YearsToDoubleReturn();
        OutputString outputString = new OutputString();

        String returnRate = "";
        boolean validInput = false;

        while (!validInput)
        {
        System.out.println("What is the rate of return?");
        returnRate = newInput.getUserInput();
        validInput = validateInput.validateInput(returnRate);

            if (!validInput)
            {
            System.out.println("Sorry. That's not a valid input.");
            }
        }

        Double yearsToDoubleReturn = calcYearsToDoubleReturn.calculateYearsToDoubleReturn(returnRate);
        String finalString = outputString.genOutputString(yearsToDoubleReturn);
        System.out.println(finalString);
    }
}
