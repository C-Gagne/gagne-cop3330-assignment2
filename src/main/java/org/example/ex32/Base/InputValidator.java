/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex32.Base;

public class InputValidator
{
    public boolean validateGuess(String isNumber)
    {
        if (isNumber.length()>4)
        { return false; }
        if (isNumber.length()==0)
        { return false; }

        for (int i = 0; i < isNumber.length(); i++)
        {
            if (!Character.isDigit(isNumber.charAt(i)))
            { return false; }
        }
        return true;
    }
    public boolean validateDifficulty(String difficulty)
    {
        if (difficulty.length() != 1)
        {return false;}

        char difficultyEntry = difficulty.charAt(0);

        if (!Character.isDigit(difficultyEntry))
        {
            return false;
        }
        else if (difficultyEntry != '1' && difficultyEntry != '2' && difficultyEntry != '3')
        {
            return false;
        }
        else {return true;}
    }
    public boolean validateYesOrNo(String playAgain)
    {
        if (playAgain.length() != 1)
        {return false;}

        char difficultyEntry = playAgain.charAt(0);

        if (!Character.isLetter(difficultyEntry))
        {
            return false;
        }
        else if (Character.toLowerCase(difficultyEntry) != 'n' && Character.toLowerCase(difficultyEntry) != 'y')
        {
            return false;
        }
        else {return true;}
    }
}
