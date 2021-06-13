/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex30.Base;

public class App
{
    public static void main(String[] args)
    {
        MultiplicationTable newMultiTable = new MultiplicationTable();
        OutputString finalString =  new OutputString();
        int[][] resultsMultiTable = newMultiTable.getMultiplicationTable();

        finalString.printOutputString(resultsMultiTable);

    }
}

