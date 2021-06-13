package org.example.ex29.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void validateInput_ReturnsFalse_Null_Input()
    {
        InputValidator validInput = new InputValidator();

        boolean actual = validInput.validateInput("");
        boolean expected = false;

        assertEquals(expected, actual);
    }
    @Test
    void validateInput_ReturnsFalse_LetterInput()
    {
        InputValidator validInput = new InputValidator();

        boolean actual = validInput.validateInput("TwentyFiveBillion");
        boolean expected = false;

        assertEquals(expected, actual);
    }
    @Test
    void validateInput_ReturnsFalse_ZeroInput()
    {
        InputValidator validInput = new InputValidator();

        boolean actual = validInput.validateInput("0");
        boolean expected = false;

        assertEquals(expected, actual);
    }
    @Test
    void validateInput_ReturnsTrue_ShortInput()
    {
        InputValidator validInput = new InputValidator();

        boolean actual = validInput.validateInput("13");
        boolean expected = true;

        assertEquals(expected, actual);
    }
}