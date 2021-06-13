/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex25.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPasswordStrengthTest {

    @Test
    void passwordValidator_returns_2_NoNumbers()
    {
        CheckPasswordStrength validPassword = new CheckPasswordStrength();

        int actual = validPassword.passwordValidator("p@SSword");
        int expected = 2;

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_returns_0_TooShort()
    {
        CheckPasswordStrength validPassword = new CheckPasswordStrength();

        int actual = validPassword.passwordValidator("p@SS");
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_returns_3_AllCharacterTypes()
    {
        CheckPasswordStrength validPassword = new CheckPasswordStrength();

        int actual = validPassword.passwordValidator("p@SSword111");
        int expected = 3;

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_returns_1_LowerCase_and_Capitals()
    {
        CheckPasswordStrength validPassword = new CheckPasswordStrength();

        int actual = validPassword.passwordValidator("Passsssssword");
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_returns_1_Numbers_and_Capitals()
    {
        CheckPasswordStrength validPassword = new CheckPasswordStrength();

        int actual = validPassword.passwordValidator("PASSSSSSSS1");
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_returns_1_Numbers_and_LowerCase()
    {
        CheckPasswordStrength validPassword = new CheckPasswordStrength();

        int actual = validPassword.passwordValidator("iamthewalrus1");
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_returns_0_Numbers_and_SpecialChar()
    {
        CheckPasswordStrength validPassword = new CheckPasswordStrength();

        int actual = validPassword.passwordValidator("11111111@@@@@");
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_returns_0_Numbers_Only()
    {
        CheckPasswordStrength validPassword = new CheckPasswordStrength();

        int actual = validPassword.passwordValidator("11111111");
        int expected = 0;

        assertEquals(expected, actual);
    }
}