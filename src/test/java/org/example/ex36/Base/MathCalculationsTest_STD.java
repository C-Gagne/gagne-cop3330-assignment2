/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex36.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathCalculationsTest_STD {

    @Test
    void std_ReturnsZeroEqual() {
        MathCalculations newSTD = new MathCalculations();

        List<String> arrayForSTD = new ArrayList<>();
        arrayForSTD.add("4.0");
        arrayForSTD.add("4.0");

        double average = newSTD.average(arrayForSTD);

        double actual = newSTD.std(arrayForSTD, average);
        double expected = 0.0;

        assertEquals(expected, actual);
    }

    @Test
    void std_ReturnsSevenPtFive() {
        MathCalculations newSTD = new MathCalculations();

        List<String> arrayForSTD = new ArrayList<>();
        arrayForSTD.add("10");
        arrayForSTD.add("25");

        double average = newSTD.average(arrayForSTD);

        double actual = newSTD.std(arrayForSTD, average);
        double expected = 7.5;

        assertEquals(expected, actual);
    }
}