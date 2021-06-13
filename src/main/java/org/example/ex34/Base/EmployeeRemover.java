/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex34.Base;

import java.util.EmptyStackException;
import java.util.List;

public class EmployeeRemover {
    public List removeEmployeeFromList(List employees, String itemToRemove)
    {
        if (employees.size() != 0) {
            employees.remove(itemToRemove);
            return employees;
        }
        else throw new EmptyStackException();
    }
}
