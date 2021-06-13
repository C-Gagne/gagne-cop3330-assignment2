/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex38.Base;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class FilterEvenNumbersTest {

    @Test
    void filterEvenNumbers_CheckTwentyInputs()
    {
        FilterEvenNumbers filterEven = new FilterEvenNumbers();
        int[] testFullArray = new int[21];
        ArrayList<Integer> testOddArray = new ArrayList<>();

        for (int i = 0; i < 20; i++)
        {
            testFullArray[i] = i;
        }

        for (int i = 0; i < 20; i++)
        {
            if (testFullArray[i] % 2 != 0)
            {
                testOddArray.add(i);
            }
        }

        ArrayList<Integer> actual = filterEven.filterEvenNumbers(testFullArray);
        ArrayList<Integer> expected = testOddArray;

        assertEquals(expected, actual);
    }

    @Test
    void filterEvenNumbers_ReturnsFalse_DoesNotRemoveEvens()
    {
        FilterEvenNumbers filterEven = new FilterEvenNumbers();
        int[] testFullArray = new int[21];
        ArrayList<Integer> testOddArray = new ArrayList<>();

        for (int i = 0; i < 20; i++)
        {
            testFullArray[i] = i;
        }

        for (int i = 0; i < 20; i++)
        {
            /*
            if (testFullArray[i] % 2 != 0)
            {
                testOddArray.add(i);
            }
             */
        }

        ArrayList<Integer> firstarray = filterEven.filterEvenNumbers(testFullArray);
        ArrayList<Integer> secondArray = testOddArray;

        boolean actual = (firstarray == secondArray);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}