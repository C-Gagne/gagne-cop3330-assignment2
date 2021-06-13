/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex37.Base;

public class PasswordGenerator
{
    public String genPassword(int numMaxLength, int numSpecialChars, int numNumbers)
    {
        ListOfLowerCase genLowerCase = new ListOfLowerCase();
        ListOfNumbers genNumber = new ListOfNumbers();
        ListOfSpecialChar genSpecialChar = new ListOfSpecialChar();
        RandomNumberGenerator genRandomNum = new RandomNumberGenerator();
        SelectRandomCharType randomCharType = new SelectRandomCharType();

        int maxLenCount = 0;

        int maxLetters = (numMaxLength - numSpecialChars - numNumbers);

        Character[] passwordArray = new Character[numMaxLength];

        while (maxLenCount != numMaxLength)
        {
            for (int i = 0; i < numMaxLength; i++)
            {

                int randomValue = randomCharType.getRandomCharType(maxLetters, numSpecialChars, numNumbers);

                if (randomValue == 0 && (maxLetters > 0))
                {
                    int randomNumForLowerCase = genRandomNum.genRandomNumberForLowerCase();
                    char randomLetter = genLowerCase.getLowerCase(randomNumForLowerCase);
                    passwordArray[i] = randomLetter;
                    maxLetters--;
                }
                else if (randomValue == 1 && (numSpecialChars > 0))
                {
                    int randomNumForSpecialChar = genRandomNum.genRandomNumberForSpecialCharOrNum();
                    char randomSpecial = genSpecialChar.getSpecialChar(randomNumForSpecialChar);
                    passwordArray[i] = randomSpecial;
                    numSpecialChars--;
                }
                else if (randomValue == 2 && (numNumbers > 0))
                {
                    int randomNumForNumber = genRandomNum.genRandomNumberForSpecialCharOrNum();
                    char randomNumber = genNumber.getNumber(randomNumForNumber);
                    passwordArray[i] = randomNumber;
                    numNumbers--;
                }
                maxLenCount++;
            }
        }

        StringBuilder generatedPassword = new StringBuilder();

        for (int i = 0; i < passwordArray.length; i++)
        {
            generatedPassword.append(passwordArray[i]);
        }

        return generatedPassword.toString();
    }
}
