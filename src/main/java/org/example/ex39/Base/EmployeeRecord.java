/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex39.Base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRecord
{
    public List employeeRecords()
    {

        List<Map<String, String>> employees = new ArrayList<Map<String, String>>();

        employees.add(new HashMap<String, String>() {{
            put("First Name", "Difo");
            put("Last Name", "Fido");
            put("Position", "God");
            put("Separation Date", "01/01/0001");
        }});

        employees.add(new HashMap<String, String>() {{
            put("First Name", "Smith");
            put("Last Name", "Apple");
            put("Position", "Farmer");
            put("Separation Date", "");
        }});

        employees.add(new HashMap<String, String>() {{
            put("First Name", "Walrus");
            put("Last Name", "MacGee");
            put("Position", "Janitron 9000");
            put("Separation Date", "");
        }});

        employees.add(new HashMap<String, String>() {{
            put("First Name", "John");
            put("Last Name", "Doe");
            put("Position", "Ded");
            put("Separation Date", "06/12/2020");
        }});

        return employees;
    }
}
