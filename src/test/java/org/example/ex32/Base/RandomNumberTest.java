package org.example.ex32.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {

    @Test
    void genRandomNumber_ReturnsTrue_DifficultyOne()
    {
        RandomNumber rando = new RandomNumber();

        int actualRandom = rando.genRandomNumber(1);
        System.out.printf("Your random number is: %d\n", actualRandom);
        boolean actual;

        if (actualRandom <= 10 && actualRandom > 0)
        {
            actual = true;
        }
        else
        {
            actual = false;
        }

        boolean expected = true;

        assertEquals(expected, actual);
    }
    @Test
    void genRandomNumber_ReturnsTrue_DifficultyTwo()
    {
        RandomNumber rando = new RandomNumber();

        int actualRandom = rando.genRandomNumber(2);
        System.out.printf("Your random number is: %d\n", actualRandom);
        boolean actual;

        if (actualRandom <= 100 && actualRandom > 0)
        {
            actual = true;
        }
        else
        {
            actual = false;
        }

        boolean expected = true;

        assertEquals(expected, actual);
    }
    @Test
    void genRandomNumber_ReturnsTrue_DifficultyThree()
    {
        RandomNumber rando = new RandomNumber();

        int actualRandom = rando.genRandomNumber(3);
        System.out.printf("Your random number is: %d\n", actualRandom);
        boolean actual;

        if (actualRandom <= 1000 && actualRandom > 0)
        {
            actual = true;
        }
        else
        {
            actual = false;
        }

        boolean expected = true;

        assertEquals(expected, actual);
    }
}