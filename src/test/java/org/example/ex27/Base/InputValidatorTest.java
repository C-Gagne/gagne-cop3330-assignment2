/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex27.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void validateInput_AllDefaultValues_ReturnsAllNullErrors() {
        InputValidator newValidation = new InputValidator();

        String actual = newValidation.validateInput("", "", "", "");
        String expected = "The first name must be filled in.\n"+"The second name must be filled in.\n"+"The ZIP code must be filled in.\n"+"The employee ID must be filled in.\n";

        assertEquals(expected, actual);

    }
    @Test
    void validateInput_ReturnsAllErrorsExceptFirstName() {
        InputValidator newValidation = new InputValidator();

        String actual = newValidation.validateInput("Difo", "", "", "");
        String expected = "The second name must be filled in.\n"+"The ZIP code must be filled in.\n"+"The employee ID must be filled in.\n";

        assertEquals(expected, actual);

    }
    @Test
    void validateInput_ReturnsAllErrorsExceptSecondName() {
        InputValidator newValidation = new InputValidator();

        String actual = newValidation.validateInput("", "Fido", "", "");
        String expected = "The first name must be filled in.\n"+"The ZIP code must be filled in.\n"+"The employee ID must be filled in.\n";

        assertEquals(expected, actual);

    }
    @Test
    void validateInput_ReturnsAllErrorsExceptSecondName_WrongZIPCode() {
        InputValidator newValidation = new InputValidator();

        String actual = newValidation.validateInput("", "Fido", "AAAAA", "");
        String expected = "The first name must be filled in.\n"+"A is not a number.\n"+"The employee ID must be filled in.\n";

        assertEquals(expected, actual);

    }

    @Test
    void validateInput_ReturnsNoErrors() {
        InputValidator newValidation = new InputValidator();

        String actual = newValidation.validateInput("Difo", "Fido", "01111", "AA-0000");
        String expected = "There were no errors found.";

        assertEquals(expected, actual);

    }
}