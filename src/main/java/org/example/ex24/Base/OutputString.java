/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex24.Base;

public class OutputString {
    public String genOutputString(String first, String second, boolean anagramResult)
    {
        if (anagramResult == false)
        {
            return (first + " and " + second + " are not anagrams.");
        }
        else if (anagramResult == true)
        {
            return (first + " and " + second + " are anagrams.");
        }
        return "Error";
    }
}
