/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex28.Base;

public class App
{
    public static void main(String[] args)
    {
        UserInput input = new UserInput();
        OutputString outputString = new OutputString();
        AddNumbers sum = new AddNumbers();

        double result = 0.0;

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter a number:");
            double userNumber = input.getUserInput();
            result = sum.addNumbers(result, userNumber);
        }

        String finalString = outputString.genOutputString(result);
        System.out.println(finalString);

    }
}
