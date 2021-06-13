/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex25.Base;

import java.util.Scanner;

public class UserInput
{
    public String getUserInput()
    {
        System.out.println("Please enter a password.");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
