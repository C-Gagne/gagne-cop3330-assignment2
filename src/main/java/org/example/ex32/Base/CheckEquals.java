/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex32.Base;

public class CheckEquals {
    public boolean checkEquals(int randomNumber, int guess)
    {
        if (randomNumber == guess) { return true; }
        else if (randomNumber > guess)
        {
            System.out.print("Too low. Guess again: ");
            return false;
        }
        else if (randomNumber < guess)
        {
            System.out.print("Too high. Guess again: ");
            return false;
        }
        else return false;

    }
}
