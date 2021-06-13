package org.example.ex29.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearsToDoubleReturnTest {

    @Test
    void calculateYearsToDoubleReturn_Returns18()
    {
        YearsToDoubleReturn getYearsTODouble = new YearsToDoubleReturn();

        double actual = getYearsTODouble.calculateYearsToDoubleReturn("4");
        double expected = 18;

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void calculateYearsToDoubleReturn_Returns1()
    {
        YearsToDoubleReturn getYearsTODouble = new YearsToDoubleReturn();

        double actual = getYearsTODouble.calculateYearsToDoubleReturn("100");
        double expected = 1;

        assertEquals(expected, actual, 0.0001);
    }
}