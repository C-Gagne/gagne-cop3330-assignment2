/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex26.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_70Months_ExampleFromExercise()
    {
        PaymentCalculator newCalculation = new PaymentCalculator();

        double actual = newCalculation.calculateMonthsUntilPaidOff(5000.0,12,100);
        double expected = 70;

        assertEquals(expected, actual);

    }

    @Test
    void calculateMonthsUntilPaidOff_returns_1Month_LowBalance()
    {
        PaymentCalculator newCalculation = new PaymentCalculator();

        double actual = newCalculation.calculateMonthsUntilPaidOff(100.0,1,110);
        double expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void calculateMonthsUntilPaidOff_returns_2Months_LowBalance()
    {
        PaymentCalculator newCalculation = new PaymentCalculator();

        double actual = newCalculation.calculateMonthsUntilPaidOff(110.0,14,100);
        double expected = 2;

        assertEquals(expected, actual);

    }
}