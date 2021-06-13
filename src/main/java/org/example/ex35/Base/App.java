/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex35.Base;

public class App {
    public static void main(String[] args) {
        UserInput newInput = new UserInput();
        String[] arrayNames = new String[5];
        RandomNumberGenerator randomNum = new RandomNumberGenerator();
        OutputGenerator finalOutput = new OutputGenerator();

        int randomPick = randomNum.genRandomNumber();

        for (int i = 0; i < 4; i++)
        {
            System.out.print("Enter a name: ");
            arrayNames[i] = newInput.getUserInput();

            while (arrayNames[i] == "")
            {
                System.out.print("Enter a name: ");
                arrayNames[i] = newInput.getUserInput();
            }
        }

        String finalString = finalOutput.generateOutput(arrayNames, randomPick);
        System.out.println(finalString);
    }
}
