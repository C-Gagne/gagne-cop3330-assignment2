/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex37.Base;

public class SelectRandomCharType
{
    public Integer getRandomCharType(int maxLetters, int numSpecialChars, int numNumbers)
    {
        RandomNumberGenerator genRandomNum = new RandomNumberGenerator();

        int randomValue = genRandomNum.genRandomValue();

        while (randomValue == 0 && maxLetters == 0) {
            return getRandomCharType(maxLetters, numSpecialChars, numNumbers);
        }
        while (randomValue == 1 && numSpecialChars == 0) {
            return getRandomCharType(maxLetters, numSpecialChars, numNumbers);
        }
        while (randomValue == 2 && numNumbers == 0) {
            return getRandomCharType(maxLetters, numSpecialChars, numNumbers);
        }
        return randomValue;
    }
}
