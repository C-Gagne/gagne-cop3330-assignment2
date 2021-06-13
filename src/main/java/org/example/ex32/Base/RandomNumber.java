/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex32.Base;

import java.util.Random;

public class RandomNumber
{
    public int genRandomNumber(int difficulty)
    {
        Random random = new Random();
        int numberVariance;

        if (difficulty == 1)
        {
            numberVariance = 10;
        }
        else if (difficulty == 2)
        {
            numberVariance = 100;
        }
        else if (difficulty == 3)
        {
            numberVariance = 1000;
        }
        else
        {
            return -1;
        }

        int randomNum = random.nextInt(numberVariance);
        return randomNum + 1;
    }
}
