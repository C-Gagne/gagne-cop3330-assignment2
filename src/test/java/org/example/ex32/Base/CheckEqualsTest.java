package org.example.ex32.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckEqualsTest {

    @Test
    void checkEquals_ReturnsTrue()
    {
        CheckEquals checkEquals = new CheckEquals();

        boolean actual = checkEquals.checkEquals(5,5);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void checkEquals_ReturnsFalse()
    {
        CheckEquals checkEquals = new CheckEquals();

        boolean actual = checkEquals.checkEquals(5,7);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}