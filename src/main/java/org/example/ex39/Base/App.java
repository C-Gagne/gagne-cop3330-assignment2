/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex39.Base;

import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        EmployeeRecord listEmployeeRecords = new EmployeeRecord();
        EditEmployeeRecords sortEmployees = new EditEmployeeRecords();
        OutputGenerator finalOutput = new OutputGenerator();

        List<Map<String, String>> employees;
        List<Map<String, String>> employeesSorted;
        employees = listEmployeeRecords.employeeRecords();


        employeesSorted = sortEmployees.sortedEmployeeRecords(employees);


        String finalString = finalOutput.genOutput(employeesSorted);
        System.out.println(finalString);

    }
}
