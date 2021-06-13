package org.example.ex33.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputGeneratorTest {

    @Test
    void generateOutput_ReturnsNo()
    {
        OutputGenerator newOutput = new OutputGenerator();
        String expected = newOutput.generateOutput(1);
        String actual = "No.";
        assertEquals(expected, actual);
    }
    @Test
    void generateOutput_ReturnsYes()
    {
        OutputGenerator newOutput = new OutputGenerator();
        String expected = newOutput.generateOutput(0);
        String actual = "Yes.";
        assertEquals(expected, actual);
    }
    @Test
    void generateOutput_ReturnsAskAgain()
    {
        OutputGenerator newOutput = new OutputGenerator();
        String expected = newOutput.generateOutput(2);
        String actual = "Ask again later.";
        assertEquals(expected, actual);
    }
    @Test
    void generateOutput_ReturnsMaybe()
    {
        OutputGenerator newOutput = new OutputGenerator();
        String actual = newOutput.generateOutput(3);
        String expected = "Maybe.";
        assertEquals(expected, actual);
    }
}