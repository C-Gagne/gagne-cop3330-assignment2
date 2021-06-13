package org.example.ex35.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputGeneratorTest {

    @Test
    void generateOutput_Returns_1isWin()
    {
        OutputGenerator outputGenerator = new OutputGenerator();

        String[] testArray = {"1","1","1","1","1"};

        String actual = outputGenerator.generateOutput(testArray, 2);
        String expected = "The winner is ...  1";

        assertEquals(expected, actual);
    }

    @Test
    void generateOutput_Returns_FoxyisWin()
    {
        OutputGenerator outputGenerator = new OutputGenerator();

        String[] testArray = {"Foxy","1","1","1","1"};

        String actual = outputGenerator.generateOutput(testArray, 0);
        String expected = "The winner is ...  Foxy";

        assertEquals(expected, actual);
    }
}