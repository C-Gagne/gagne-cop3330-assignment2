/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex24.NightmareChallengeSolution;

public class App
{
    public static void main(String[] args)
    {
        UserInput getString = new UserInput();
        AnagramDetector determineAnagram = new AnagramDetector();
        OutputString outputString = new OutputString();

        String firstString = getString.getUserInput();
        String secondString = getString.getUserInput();

        boolean anagramResult = determineAnagram.isAnagram(firstString, secondString);
        String finalString = outputString.genOutputString(firstString, secondString, anagramResult);

        System.out.println(finalString);
    }
}
