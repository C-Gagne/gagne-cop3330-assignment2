/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex28.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddNumbersTest {

    @Test
    void addNumbers_Returns10_BasicSum() {
        AddNumbers getSum = new AddNumbers();

        double actual = getSum.addNumbers(5,5);
        double expected = 10.0;

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void addNumbers_Returns15_NegativeSum() {
        AddNumbers getSum = new AddNumbers();

        double actual = getSum.addNumbers(25,-10.0);
        double expected = 15.0;

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void addNumbers_Returns0_Sum() {
        AddNumbers getSum = new AddNumbers();

        double actual = getSum.addNumbers(0,0);
        double expected = 0;

        assertEquals(expected, actual, 0.0001);
    }
}