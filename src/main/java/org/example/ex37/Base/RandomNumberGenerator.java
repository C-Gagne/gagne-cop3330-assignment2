/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex37.Base;

import java.util.Random;

public class RandomNumberGenerator
{
    public int genRandomNumberForLowerCase()
    {
        Random random = new Random();
        int randomNum = random.nextInt(26);
        return randomNum;
    }

    public int genRandomNumberForSpecialCharOrNum()
    {
        Random random = new Random();
        int randomNum = random.nextInt(10);
        return randomNum;
    }

    public int genRandomValue()
    {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        return randomNum;
    }
}
