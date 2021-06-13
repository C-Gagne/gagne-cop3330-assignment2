/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex24.Base;

public class App
{
    public static void main(String[] args)
    {
        UserInput getString = new UserInput();
        AnagramDetector getSortedString = new AnagramDetector();
        AnagramDetector determineAnagram = new AnagramDetector();
        OutputString outputString = new OutputString();

        String firstString = getString.getUserInput();
        String sortedFirstString = getSortedString.sortString(firstString);
        String secondString = getString.getUserInput();
        String sortedSecondString = getSortedString.sortString(secondString);

        boolean anagramResult = determineAnagram.isAnagram(sortedFirstString, sortedSecondString);
        String finalString = outputString.genOutputString(firstString, secondString, anagramResult);

        System.out.println(finalString);
    }
}
