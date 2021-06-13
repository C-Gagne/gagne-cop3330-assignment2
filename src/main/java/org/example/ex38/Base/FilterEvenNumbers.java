/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex38.Base;

import java.util.ArrayList;

public class FilterEvenNumbers
{
    public ArrayList<Integer> filterEvenNumbers(int[] numberArray)
    {
        ArrayList<Integer> filteredArray = new ArrayList<>();

        for (int i = 0; i<numberArray.length; i++)
        {
            if (numberArray[i] % 2 != 0)
            {
                filteredArray.add(numberArray[i]);
            }
        }

        return filteredArray;
    }
}
