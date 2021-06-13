/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex35.Base;

public class OutputGenerator
{
    public String generateOutput(String[] arrayNames, int randomNumber)
    {
        return String.format("The winner is ...  " + arrayNames[randomNumber]);
    }

}
