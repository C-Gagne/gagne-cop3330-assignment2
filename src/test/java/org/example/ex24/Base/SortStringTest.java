/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex24.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortStringTest {

    @Test
    void sortString_a_z_space()
    {
        AnagramDetector newSort = new AnagramDetector();

        String actual = newSort.sortString("zzzzz aaaaa");
        String expected = " aaaaazzzzz";

        assertEquals(expected, actual);
    }

    @Test
    void sortString_boy_AlreadySorted()
    {
        AnagramDetector newSort = new AnagramDetector();

        String actual = newSort.sortString("boy");
        String expected = "boy";

        assertEquals(expected, actual);
    }

    @Test
    void sortString_AllSpaces()
    {
        AnagramDetector newSort = new AnagramDetector();

        String actual = newSort.sortString("     ");
        String expected = "     ";

        assertEquals(expected, actual);
    }

    @Test
    void sortString_ManySameCharacters()
    {
        AnagramDetector newSort = new AnagramDetector();

        String actual = newSort.sortString("ZzzZZZzzZZZZzz");
        String expected = "zzzzzzzzzzzzzz";

        assertEquals(expected, actual);
    }

    @Test
    void sortString_ComplexExample()
    {
        AnagramDetector newSort = new AnagramDetector();

        String actual = newSort.sortString("Linbob is a linbog");
        String expected = "   abbbgiiillnnoos";

        assertEquals(expected, actual);
    }
}