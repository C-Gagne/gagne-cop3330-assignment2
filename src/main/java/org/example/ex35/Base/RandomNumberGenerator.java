/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex35.Base;

import java.util.Random;

public class RandomNumberGenerator
{
    public int genRandomNumber()
    {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        return randomNum;
    }
}
