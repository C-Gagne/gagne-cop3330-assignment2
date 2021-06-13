/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex37.Base;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers
{
    public Character getNumber(int randomNum)
    {
        List<Character> arrayOfNumbers = new ArrayList<>();
        arrayOfNumbers.add('0');
        arrayOfNumbers.add('1');
        arrayOfNumbers.add('2');
        arrayOfNumbers.add('3');
        arrayOfNumbers.add('4');
        arrayOfNumbers.add('5');
        arrayOfNumbers.add('6');
        arrayOfNumbers.add('7');
        arrayOfNumbers.add('8');
        arrayOfNumbers.add('9');

        char output = arrayOfNumbers.get(randomNum);

        return output;
    }

}
