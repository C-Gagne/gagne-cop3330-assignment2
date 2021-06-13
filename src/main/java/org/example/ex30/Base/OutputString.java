/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex30.Base;

public class OutputString
{
    public void printOutputString(int[][] multiTableArray)
    {
        for (int j=1; j <=12; j++)
        {
            for (int i = 1; i <=12; i++)
            {
                System.out.printf("%3s  ", multiTableArray[i][j]);
            }
            System.out.println();
        }
    }
}
