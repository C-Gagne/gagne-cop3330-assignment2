/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex36.Base;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        UserInput newInput = new UserInput();
        InputValidator checkInput = new InputValidator();
        MathCalculations newCalculations = new MathCalculations();
        GenerateOutput newOutput = new GenerateOutput();

        List<String> arrayForMath = new ArrayList<>();

        String heldNumber;

        boolean isDone = false;
        while (!isDone || arrayForMath.size() == 0)
        {
            boolean isValidNum = false;
            isDone = false;
            while (!isValidNum)
            {
                System.out.print("Enter a number: ");
                heldNumber = newInput.getUserInput();
                isValidNum = checkInput.checkIsNum(heldNumber);
                if (!isValidNum) {
                    isDone = checkInput.checkIsDone(heldNumber);
                    if (isDone)
                    { break; }
                    else
                        System.out.println("That is not a valid number.");
                }
                else {
                    arrayForMath.add(heldNumber);
                }
            }
        }
        double calculatedAverage = newCalculations.average(arrayForMath);
        double calculatedMax = newCalculations.max(arrayForMath);
        double calculatedMin = newCalculations.min(arrayForMath);
        double calculatedSTD = newCalculations.std(arrayForMath, calculatedAverage);

        String finalString = newOutput.genOutputString(calculatedMin, calculatedMax, calculatedAverage, calculatedSTD);
        System.out.println(finalString);
    }
}
