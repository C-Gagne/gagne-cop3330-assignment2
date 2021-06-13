package org.example.ex40.Base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SearchEmployeeRecordsTest {

    @Test
    void searchPrefixEmployeeRecords_UnfilteredVsFiltered_AssertNotEqual()
    {
        SearchEmployeeRecords searchRecords = new SearchEmployeeRecords();
        List<Map<String, String>> employeesTest = new ArrayList<Map<String, String>>();
        String prefix = "J";

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "Difo");
            put("Last Name", "Fido");
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
            put("Last Name", "MacGee");
            put("Position", "Janitron 9000");
            put("Separation Date", "");
        }});

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "John");
            put("Last Name", "Doe");
            put("Position", "Ded");
            put("Separation Date", "06/12/2020");
        }});


        List<Map<String, String>> notFilteredEmployees = new ArrayList<Map<String, String>>();

        notFilteredEmployees.add(new HashMap<String, String>() {{
            put("First Name", "Difo");
            put("Last Name", "Fido");
            put("Position", "God");
            put("Separation Date", "01/01/0001");
        }});

        notFilteredEmployees.add(new HashMap<String, String>() {{
            put("First Name", "Smith");
            put("Last Name", "Apple");
            put("Position", "Farmer");
            put("Separation Date", "");
        }});

        notFilteredEmployees.add(new HashMap<String, String>() {{
            put("First Name", "Walrus");
            put("Last Name", "MacGee");
            put("Position", "Janitron 9000");
            put("Separation Date", "");
        }});

        notFilteredEmployees.add(new HashMap<String, String>() {{
            put("First Name", "John");
            put("Last Name", "Doe");
            put("Position", "Ded");
            put("Separation Date", "06/12/2020");
        }});

        List<Map<String, String>> actual = searchRecords.searchPrefixEmployeeRecords(employeesTest, prefix);
        List<Map<String, String>> expected = notFilteredEmployees;

        assertNotEquals(expected, actual);
    }

    @Test
    void searchPrefixEmployeeRecords_HandFiltered_StringJ_AssertEqual()
    {
        SearchEmployeeRecords searchRecords = new SearchEmployeeRecords();
        List<Map<String, String>> employeesTest = new ArrayList<Map<String, String>>();
        String prefix = "J";

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "Difo");
            put("Last Name", "Fido");
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
            put("Last Name", "MacGee");
            put("Position", "Janitron 9000");
            put("Separation Date", "");
        }});

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "John");
            put("Last Name", "Doe");
            put("Position", "Ded");
            put("Separation Date", "06/12/2020");
        }});


        List<Map<String, String>> notFilteredEmployees = new ArrayList<Map<String, String>>();

        notFilteredEmployees.add(new HashMap<String, String>() {{
            put("First Name", "John");
            put("Last Name", "Doe");
            put("Position", "Ded");
            put("Separation Date", "06/12/2020");
        }});

        List<Map<String, String>> actual = searchRecords.searchPrefixEmployeeRecords(employeesTest, prefix);
        List<Map<String, String>> expected = notFilteredEmployees;

        assertEquals(expected, actual);
    }


    @Test
    void searchPrefixEmployeeRecords_HandFiltered_StringA_AssertEqual()
    {
        SearchEmployeeRecords searchRecords = new SearchEmployeeRecords();
        List<Map<String, String>> employeesTest = new ArrayList<Map<String, String>>();
        String prefix = "A";

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "Difo");
            put("Last Name", "Fido");
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
            put("Last Name", "MacGee");
            put("Position", "Janitron 9000");
            put("Separation Date", "");
        }});

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "John");
            put("Last Name", "Doe");
            put("Position", "Ded");
            put("Separation Date", "06/12/2020");
        }});


        List<Map<String, String>> notFilteredEmployees = new ArrayList<Map<String, String>>();


        notFilteredEmployees.add(new HashMap<String, String>() {{
            put("First Name", "Smith");
            put("Last Name", "Apple");
            put("Position", "Farmer");
            put("Separation Date", "");
        }});


        List<Map<String, String>> actual = searchRecords.searchPrefixEmployeeRecords(employeesTest, prefix);
        List<Map<String, String>> expected = notFilteredEmployees;

        assertEquals(expected, actual);
    }


    @Test
    void searchPrefixEmployeeRecords_HandFiltered_StringDifo_AssertEqual()
    {
        SearchEmployeeRecords searchRecords = new SearchEmployeeRecords();
        List<Map<String, String>> employeesTest = new ArrayList<Map<String, String>>();
        String prefix = "Difo";

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "Difo");
            put("Last Name", "Fido");
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
            put("Last Name", "MacGee");
            put("Position", "Janitron 9000");
            put("Separation Date", "");
        }});

        employeesTest.add(new HashMap<String, String>() {{
            put("First Name", "John");
            put("Last Name", "Doe");
            put("Position", "Ded");
            put("Separation Date", "06/12/2020");
        }});


        List<Map<String, String>> notFilteredEmployees = new ArrayList<Map<String, String>>();

        notFilteredEmployees.add(new HashMap<String, String>() {{
            put("First Name", "Difo");
            put("Last Name", "Fido");
            put("Position", "God");
            put("Separation Date", "01/01/0001");
        }});


        List<Map<String, String>> actual = searchRecords.searchPrefixEmployeeRecords(employeesTest, prefix);
        List<Map<String, String>> expected = notFilteredEmployees;

        assertEquals(expected, actual);
    }
}