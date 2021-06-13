/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex36.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathCalculationsTest_Average {

    @Test
    void average_ReturnsFour()
    {
        MathCalculations newAverage = new MathCalculations();

        List<String> arrayForAverage = new ArrayList<>();
        arrayForAverage.add("4.0");
        arrayForAverage.add("4.0");

        double actual = newAverage.average(arrayForAverage);
        double expected = 4.0;

        assertEquals(expected, actual);

    }

    @Test
    void average_ReturnsFive()
    {
        MathCalculations newAverage = new MathCalculations();

        List<String> arrayForAverage = new ArrayList<>();
        arrayForAverage.add("10.0");
        arrayForAverage.add("0.0");

        double actual = newAverage.average(arrayForAverage);
        double expected = 5.0;

        assertEquals(expected, actual);

    }
}