/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex37.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void genPassword_ReturnsTrue_FiveOneOne_LongSampleCode()
    {

        PasswordGenerator genTestPassword = new PasswordGenerator();
        int numMaxLen = 5;
        int numSpecialChars = 1;
        int numNumbers = 1;
        String testPassword = genTestPassword.genPassword(numMaxLen,numSpecialChars,numNumbers);

        int letterCount = 0;
        int numberCount = 0;
        int specialCount = 0;
        int maxLetters = numMaxLen - numSpecialChars - numNumbers;

        for (int i = 0; i < testPassword.length(); i++)
        {
            if (testPassword.charAt(i) == '!' || testPassword.charAt(i) == '@' || testPassword.charAt(i) == '#' || testPassword.charAt(i) == '$' || testPassword.charAt(i) == '%' || testPassword.charAt(i) == '^' || testPassword.charAt(i) == '&' || testPassword.charAt(i) == '*' || testPassword.charAt(i) == '(' || testPassword.charAt(i) == ')')
            {
                specialCount++;
            }
            else if (Character.isLetter(testPassword.charAt(i)))
            {
                letterCount++;
            }
            else if (Character.isDigit(testPassword.charAt(i)))
            {
                numberCount++;
            }
        }

        boolean actual = ((numberCount == numNumbers) && (letterCount == maxLetters) && (specialCount == numSpecialChars));
        assertTrue(actual);
    }

    @Test
    void genPassword_ReturnsTrue_Six_TwoTwo_LongSampleCode()
    {

        PasswordGenerator genTestPassword = new PasswordGenerator();
        int numMaxLen = 6;
        int numSpecialChars = 2;
        int numNumbers = 2;
        String testPassword = genTestPassword.genPassword(numMaxLen,numSpecialChars,numNumbers);
        System.out.println(testPassword);

        int letterCount = 0;
        int numberCount = 0;
        int specialCount = 0;
        int maxLetters = numMaxLen - numSpecialChars - numNumbers;

        for (int i = 0; i < testPassword.length(); i++)
        {
            if (testPassword.charAt(i) == '!' || testPassword.charAt(i) == '@' || testPassword.charAt(i) == '#' || testPassword.charAt(i) == '$' || testPassword.charAt(i) == '%' || testPassword.charAt(i) == '^' || testPassword.charAt(i) == '&' || testPassword.charAt(i) == '*' || testPassword.charAt(i) == '(' || testPassword.charAt(i) == ')')
            {
                specialCount++;
            }
            else if (Character.isLetter(testPassword.charAt(i)))
            {
                letterCount++;
            }
            else if (Character.isDigit(testPassword.charAt(i)))
            {
                numberCount++;
            }
        }

        boolean actual = ((numberCount == numNumbers) && (letterCount == maxLetters) && (specialCount == numSpecialChars));
        assertTrue(actual);
    }
    @Test
    void genPassword_ReturnsTrue_Hundred_TenTen_LongSampleCode()
    {

        PasswordGenerator genTestPassword = new PasswordGenerator();
        int numMaxLen = 100;
        int numSpecialChars = 10;
        int numNumbers = 10;
        String testPassword = genTestPassword.genPassword(numMaxLen,numSpecialChars,numNumbers);
        System.out.println(testPassword);

        int letterCount = 0;
        int numberCount = 0;
        int specialCount = 0;
        int maxLetters = numMaxLen - numSpecialChars - numNumbers;

        for (int i = 0; i < testPassword.length(); i++)
        {
            if (testPassword.charAt(i) == '!' || testPassword.charAt(i) == '@' || testPassword.charAt(i) == '#' || testPassword.charAt(i) == '$' || testPassword.charAt(i) == '%' || testPassword.charAt(i) == '^' || testPassword.charAt(i) == '&' || testPassword.charAt(i) == '*' || testPassword.charAt(i) == '(' || testPassword.charAt(i) == ')')
            {
                specialCount++;
            }
            else if (Character.isLetter(testPassword.charAt(i)))
            {
                letterCount++;
            }
            else if (Character.isDigit(testPassword.charAt(i)))
            {
                numberCount++;
            }
        }

        boolean actual = ((numberCount == numNumbers) && (letterCount == maxLetters) && (specialCount == numSpecialChars));
        assertTrue(actual);
    }
}