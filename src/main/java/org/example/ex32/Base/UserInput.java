/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex32.Base;

import java.util.Scanner;

public class UserInput
{
    public String getUserInput()
    {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
