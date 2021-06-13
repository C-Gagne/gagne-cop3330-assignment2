/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex40.Base;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args)
    {
        UserInput newPrefix = new UserInput();
        EmployeeRecords listEmployees = new EmployeeRecords();
        SearchEmployeeRecords searchRecords = new SearchEmployeeRecords();
        OutputGenerator newOutput = new OutputGenerator();

        List<Map<String, String>> employees;
        employees = listEmployees.createEmployeeRecords();
        System.out.print("Enter a search string: ");
        String searchString = newPrefix.getUserInput();

        List<Map<String, String>> matchingEmployees;
        matchingEmployees = searchRecords.searchPrefixEmployeeRecords(employees,searchString);

        String finalString = newOutput.genOutput(matchingEmployees);
        System.out.println(finalString);

    }
}
