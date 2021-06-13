/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex24.Base;

import java.util.Locale;

public class AnagramDetector
{
    // Requires the strings to be sorted.
    public boolean isAnagram(String firstString, String secondString)
    {
        if (firstString.length() != secondString.length())
        {
            return false;
        }

        for (int i = 0; i < firstString.length(); i++)
        {
            if (Character.toLowerCase(firstString.charAt(i)) != Character.toLowerCase(secondString.charAt(i)))
            {
            return false;
            }
        }
        return true;
    }

    public String sortString(String str)
    {
        // Returns the string sorted, in all lower case.
        String lowerCaseStr = str.toLowerCase();
        char[] characterArray = lowerCaseStr.toCharArray();
        java.util.Arrays.sort(characterArray);
        String sortedStr = new String(characterArray);

        return sortedStr;
    }
}