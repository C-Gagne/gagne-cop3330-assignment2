/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex31.Base;

public class App
{
    public static void main(String[] args)
    {
        UserInput newInput = new UserInput();
        InputValidator newValidation = new InputValidator();
        KarvonenHeartRateCalculator newHRCalc = new KarvonenHeartRateCalculator();

        String age = "";
        String restingHR = "";
        boolean validInput = false;

        while (!validInput)
        {
            System.out.println("Age:");
           age = newInput.getUserInput();
           validInput = newValidation.validateInput(age);

           if (!validInput)
           {
               System.out.println("That is not a valid input.");
           }
        }

        validInput = false;

        while (!validInput)
        {
            System.out.println("Resting Heart Rate:");
            restingHR = newInput.getUserInput();
            validInput = newValidation.validateInput(restingHR);

            if (!validInput)
            {
                System.out.println("That is not a valid input.");
            }
        }

        newHRCalc.getHeartRate(Double.parseDouble(age), Double.parseDouble(restingHR));
    }
}
