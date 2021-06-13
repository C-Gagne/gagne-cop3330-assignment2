/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex25.Base;

public class CheckPasswordStrength {
    public Integer passwordValidator(String password)
    {
        int passwordStrength = 0;

        boolean isCapital = false;
        boolean isLowerCase = false;
        boolean isNumber = false;
        boolean isSpecialChar = false;

        for (short i = 0; i < password.length(); i++)
        {
            char passwordChar = password.charAt(i);
            if (Character.isUpperCase(passwordChar) && (!isCapital))
            { isCapital = true;}
            if (Character.isLowerCase(passwordChar) && (!isLowerCase))
            { isLowerCase = true;}
            if (Character.isDigit(passwordChar) && (!isNumber))
            { isNumber = true;}
            if ((passwordChar == '!') ||(passwordChar == '@') || (passwordChar == '#') || (passwordChar == '$') || (passwordChar == '%') || (passwordChar == '^') || (passwordChar == '&') || (passwordChar == '*') || (passwordChar == '(') || (passwordChar == ')') || (passwordChar == '-') || (passwordChar == '_') || (passwordChar == '+') || (passwordChar == '='))
            { isSpecialChar = true;}
        }

        if (password.length() <= 5)
        {
            passwordStrength = 0;
        }
        else if (isCapital && isLowerCase && isNumber && isSpecialChar)
        {
            passwordStrength = 3;
        }
        else if (isCapital && isLowerCase && isNumber && !isSpecialChar)
        {
            passwordStrength = 2;
        }
        else if (isCapital && isLowerCase && !isNumber && isSpecialChar)
        {
            passwordStrength = 2;
        }
        else if (isCapital && !isLowerCase && isNumber && isSpecialChar)
        {
            passwordStrength = 2;
        }
        else if (!isCapital && isLowerCase && isNumber && isSpecialChar)
        {
            passwordStrength = 2;
        }
        else if (isCapital && isLowerCase && !isNumber && !isSpecialChar)
        {
            passwordStrength = 1;
        }
        else if (!isCapital && isLowerCase && isNumber && !isSpecialChar)
        {
            passwordStrength = 1;
        }
        else if (isCapital && !isLowerCase && !isNumber && isSpecialChar)
        {
            passwordStrength = 1;
        }
        else if (isCapital && !isLowerCase && isNumber && !isSpecialChar)
        {
            passwordStrength = 1;
        }
        // Note: Numbers and special characters returns 0 due to there being fewer character "options" overall.

        return passwordStrength;
    }
}
