/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex34.Base;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args)
    {
        EmployeeRemover output = new EmployeeRemover();
        UserInput newInput = new UserInput();

        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Johnson");
        employees.add("Difo Fido");
        employees.add("Walrus McGee");

        for (int i = 0; i < employees.size(); i++)
        {
            System.out.println(employees.get(i));
        }

        System.out.print("\nEnter an employee to remove: ");
        String itemToRemove = newInput.getUserInput();

        List<String> newEmployeeList = output.removeEmployeeFromList(employees,itemToRemove);

        for (int i = 0; i < newEmployeeList.size(); i++)
        {
            System.out.println(newEmployeeList.get(i));
        }

    }
}