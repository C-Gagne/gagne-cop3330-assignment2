/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex27.Base;

public class App
{
    public static void main(String[] args)
    {
        UserInput input = new UserInput();
        InputValidator inputChecker = new InputValidator();

        System.out.println("Enter the first name:");
        String firstName = input.getUserInput();

        System.out.println("Enter the second name:");
        String secondName = input.getUserInput();

        System.out.println("Enter the ZIP code:");
        String zipCode = input.getUserInput();

        System.out.println("Enter the employee ID:");
        String employeeID = input.getUserInput();

        String listErrors = inputChecker.validateInput(firstName, secondName, zipCode, employeeID);

        System.out.println(listErrors);


    }
}
