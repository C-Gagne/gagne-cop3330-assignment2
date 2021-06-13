/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex34.Base;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRemoverTest {

    @Test
    void employeeList_RemoveDifoFromList()
    {
        EmployeeRemover newOutput = new EmployeeRemover();

        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Johnson");
        employees.add("Difo Fido");
        employees.add("Walrus McGee");

        List<String> actual = newOutput.removeEmployeeFromList(employees, "Difo Fido");
        List<String> expected = new ArrayList<>();
        expected.add("John Smith");
        expected.add("Jackie Johnson");
        expected.add("Walrus McGee");
        assertEquals(expected, actual);

    }

    @Test
    void employeeList_RemoveNothingFromList()
    {
        EmployeeRemover newOutput = new EmployeeRemover();

        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Johnson");
        employees.add("Difo Fido");
        employees.add("Walrus McGee");

        List<String> actual = newOutput.removeEmployeeFromList(employees, "");
        List<String> expected = new ArrayList<>();
        expected.add("John Smith");
        expected.add("Jackie Johnson");
        expected.add("Difo Fido");
        expected.add("Walrus McGee");

        assertEquals(expected, actual);

    }
}