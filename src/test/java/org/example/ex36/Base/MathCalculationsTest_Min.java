/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex36.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathCalculationsTest_Min {

    @Test
    void min_ReturnsFour_NonEqualNumbers() {
        MathCalculations newMin = new MathCalculations();

        List<String> arrayForMin = new ArrayList<>();
        arrayForMin.add("4.0");
        arrayForMin.add("5.0");

        double actual = newMin.min(arrayForMin);
        double expected = 4.0;

        assertEquals(expected, actual);
    }
    @Test
    void min_ReturnsFour_EqualNumbers() {
        MathCalculations newMin = new MathCalculations();

        List<String> arrayForMin = new ArrayList<>();
        arrayForMin.add("4.0");
        arrayForMin.add("4.0");

        double actual = newMin.min(arrayForMin);
        double expected = 4.0;

        assertEquals(expected, actual);
    }
}