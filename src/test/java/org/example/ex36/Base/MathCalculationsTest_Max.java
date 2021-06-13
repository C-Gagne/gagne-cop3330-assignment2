package org.example.ex36.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathCalculationsTest_Max {

    @Test
    void max_ReturnsFour_EqualNumbers()
    {
        MathCalculations newMax = new MathCalculations();

        List<String> arrayForMax = new ArrayList<>();
        arrayForMax.add("4.0");
        arrayForMax.add("4.0");

        double actual = newMax.max(arrayForMax);
        double expected = 4.0;

        assertEquals(expected, actual);
    }
    @Test
    void max_ReturnsFive_NonEqualNumbers()
    {
        MathCalculations newMax = new MathCalculations();

        List<String> arrayForMax = new ArrayList<>();
        arrayForMax.add("4.0");
        arrayForMax.add("5.0");

        double actual = newMax.max(arrayForMax);
        double expected = 5.0;

        assertEquals(expected, actual);
    }
}