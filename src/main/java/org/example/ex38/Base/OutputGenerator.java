/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex38.Base;

import java.util.ArrayList;

public class OutputGenerator
{
    public String genOutput(ArrayList<Integer> finalFilteredArray)
    {
        StringBuilder outputString = new StringBuilder();

        ArrayList<String> strFinalFilteredArray = new ArrayList<>();

        for (int i = 0; i < finalFilteredArray.size(); i++)
        {
            strFinalFilteredArray.add(String.valueOf(finalFilteredArray.get(i)));
        }


        for (int i = 0; i < finalFilteredArray.size(); i++)
        {
            outputString.append(strFinalFilteredArray.get(i));
            outputString.append(" ");
        }

        return outputString.toString();
    }
}
