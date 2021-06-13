/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex36.Base;

public class InputValidator {
    public boolean checkIsNum(String number)
    {
        if (number.length() == 0){
            return false;}

        int decimalCount = 0;
        int negativeCount = 0;


        for (int i = 0; i< number.length(); i++)
        {
            if (number.charAt(0) == '-' && negativeCount == 0)
            {
                negativeCount++;
            }
            else if (number.charAt(i) == '.' && decimalCount == 0)
            {
                decimalCount++;
            }
            else if (!Character.isDigit(number.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public boolean checkIsDone(String number)
    {
        if (number.length() != 4){
            return false;}


        char firstChar = Character.toLowerCase(number.charAt(0));
        if (firstChar != 'd')
        {
            return false;
        }
        char secondChar = Character.toLowerCase(number.charAt(1));
        if (secondChar != 'o')
        {
            return false;
        }
        char thirdChar = Character.toLowerCase(number.charAt(2));
        if (thirdChar != 'n')
        {
            return false;
        }
        char fourthChar = Character.toLowerCase(number.charAt(3));
        if (fourthChar != 'e')
        {
            return false;
        }

        return true;
    }
}
