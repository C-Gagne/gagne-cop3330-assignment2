/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex39.Base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class EditEmployeeRecordsTest {

    @Test
    void sortedEmployeeRecords_HandSortedVsProgramSorted_Equals()
    {
        EditEmployeeRecords sortRecords = new EditEmployeeRecords();
        List<Map<String, String>> employeesTest = new ArrayList<Map<String, String>>();

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "Difo");
            put("Last Name", "Avalanche");
            put("Position", "God");
            put("Separation Date", "01/01/0001");
        }});

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "Smith");
            put("Last Name", "Apple");
            put("Position", "Farmer");
            put("Separation Date", "");
        }});

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "Walrus");
            put("Last Name", "Bacon");
            put("Position", "Janitron 9000");
            put("Separation Date", "");
        }});

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "John");
            put("Last Name", "Anagram");
            put("Position", "Ded");
            put("Separation Date", "06/12/2020");
        }});

        List<Map<String, String>> handSortedEmployees = new ArrayList<Map<String, String>>();

        handSortedEmployees.add(new HashMap<String, String>() {{
            put("First Name", "John");
            put("Last Name", "Anagram");
            put("Position", "Ded");
            put("Separation Date", "06/12/2020");
        }});

        handSortedEmployees.add(new HashMap<String, String>() {{
            put("First Name", "Smith");
            put("Last Name", "Apple");
            put("Position", "Farmer");
            put("Separation Date", "");
        }});

        handSortedEmployees.add(new HashMap<String, String>() {{
            put("First Name", "Difo");
            put("Last Name", "Avalanche");
            put("Position", "God");
            put("Separation Date", "01/01/0001");
        }});

        handSortedEmployees.add(new HashMap<String, String>() {{
            put("First Name", "Walrus");
            put("Last Name", "Bacon");
            put("Position", "Janitron 9000");
            put("Separation Date", "");
        }});


        List<Map<String, String>> actual = sortRecords.sortedEmployeeRecords(employeesTest);
        List<Map<String, String>> expected = handSortedEmployees;

        assertEquals(expected, actual);
    }

    @Test
    void sortedEmployeeRecords_NotSortedvsProgramSorted_NotEquals()
    {
        EditEmployeeRecords sortRecords = new EditEmployeeRecords();
        List<Map<String, String>> employeesTest = new ArrayList<Map<String, String>>();

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "Difo");
            put("Last Name", "Avalanche");
            put("Position", "God");
            put("Separation Date", "01/01/0001");
        }});

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "Smith");
            put("Last Name", "Apple");
            put("Position", "Farmer");
            put("Separation Date", "");
        }});

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "Walrus");
            put("Last Name", "Bacon");
            put("Position", "Janitron 9000");
            put("Separation Date", "");
        }});

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "John");
            put("Last Name", "Anagram");
            put("Position", "Ded");
            put("Separation Date", "06/12/2020");
        }});

        List<Map<String, String>> notSortedEmployees = new ArrayList<Map<String, String>>();


        notSortedEmployees.add(new HashMap<String, String>() {{
            put("First Name", "Smith");
            put("Last Name", "Apple");
            put("Position", "Farmer");
            put("Separation Date", "");
        }});

        notSortedEmployees.add(new HashMap<String, String>() {{
            put("First Name", "Difo");
            put("Last Name", "Avalanche");
            put("Position", "God");
            put("Separation Date", "01/01/0001");
        }});

        notSortedEmployees.add(new HashMap<String, String>() {{
            put("First Name", "Walrus");
            put("Last Name", "Bacon");
            put("Position", "Janitron 9000");
            put("Separation Date", "");
        }});

        notSortedEmployees.add(new HashMap<String, String>() {{
            put("First Name", "John");
            put("Last Name", "Anagram");
            put("Position", "Ded");
            put("Separation Date", "06/12/2020");
        }});


        List<Map<String, String>> actual = sortRecords.sortedEmployeeRecords(employeesTest);
        List<Map<String, String>> expected = notSortedEmployees;

        assertNotEquals(expected, actual);
    }
}