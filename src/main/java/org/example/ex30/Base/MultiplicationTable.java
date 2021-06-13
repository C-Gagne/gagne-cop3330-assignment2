/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex30.Base;

public class MultiplicationTable
{
    public int[][] getMultiplicationTable()
    {
        int[][] multiTableArray = new int[13][13];

        for (int j = 1; j <= 12; j++)
        {
            for (int i = 1; i <= 12; i++)
            {
                int multiplicationRes =  (j * i) ;
                multiTableArray[i][j] = multiplicationRes;
            }
        }
        return multiTableArray;
    }
}
