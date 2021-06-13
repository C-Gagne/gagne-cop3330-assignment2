/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex24.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_True_SimpleExample()
    {
        AnagramDetector detectAnagram = new AnagramDetector();

        String first = detectAnagram.sortString("aaa");
        String second = detectAnagram.sortString("aaa");
        boolean actual = detectAnagram.isAnagram(first, second);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_True_ComplexExample()
    {
        AnagramDetector detectAnagram = new AnagramDetector();

        String first = detectAnagram.sortString("Boblin is a goblin");
        String second = detectAnagram.sortString("Linbob is a linbog");
        boolean actual = detectAnagram.isAnagram(first, second);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_False_Different_Str_Lengths()
    {
        AnagramDetector detectAnagram = new AnagramDetector();

        String first = detectAnagram.sortString("Alphabet soup");
        String second = detectAnagram.sortString("Turtles");
        boolean actual = detectAnagram.isAnagram(first, second);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_False_Difficult_Different_Str_Lengths()
    {
        AnagramDetector detectAnagram = new AnagramDetector();

        String first = detectAnagram.sortString("Alphabet");
        String second = detectAnagram.sortString("Alphabe");
        boolean actual = detectAnagram.isAnagram(first, second);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}