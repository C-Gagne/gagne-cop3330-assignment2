/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex38.Base;

import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        UserInput newInput = new UserInput();
        ConvertArray convertArr = new ConvertArray();
        FilterEvenNumbers filterArray = new FilterEvenNumbers();
        ArrayList<Integer> finalFilteredArray;
        OutputGenerator genFinString = new OutputGenerator();

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String userList = newInput.getUserInput();

        String[] listNumbers = userList.split(" ");
        int[] numberArray = convertArr.convertStringToInt(listNumbers);

        finalFilteredArray = filterArray.filterEvenNumbers(numberArray);

        String finalString = genFinString.genOutput(finalFilteredArray);
        System.out.print(finalString);

    }
}
