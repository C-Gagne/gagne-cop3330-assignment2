/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex39.Base;

import java.util.Comparator;
import java.util.List;
import java.util.Map;


public class EditEmployeeRecords
{
    public List sortedEmployeeRecords(List<Map<String,String>> employeeRecords)
    {
        employeeRecords.sort(Comparator.comparing(lastName -> lastName.get("Last Name")));
        return employeeRecords;
    }
}
