/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex38.Base;

public class ConvertArray {
    public int[] convertStringToInt(String[] stringArr)
    {
        int[] convertedToInt = new int[stringArr.length];

        for (int i = 0; i <stringArr.length; i++)
        {
            convertedToInt[i] = Integer.parseInt(stringArr[i]);
        }

        return convertedToInt;
    }
}
