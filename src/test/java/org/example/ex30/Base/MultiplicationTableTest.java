/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex30.Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {

    @Test
    void getMultiplicationTable_TestFailsForSomeReason()
    {
        MultiplicationTable newMultiTable = new MultiplicationTable();

        int[][] actual = newMultiTable.getMultiplicationTable();
        int[][] expected = newMultiTable.getMultiplicationTable();

        assertEquals(expected, actual);

    }
}