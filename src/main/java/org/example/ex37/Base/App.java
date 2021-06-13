/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex37.Base;

public class App
{
    public static void main(String[] args)
    {
        UserInput newInput = new UserInput();
        PasswordGenerator newPassword = new PasswordGenerator();

        System.out.println("What is the minimum length?");
        int numMaxLength = newInput.getUserInt();
        System.out.println("How many special characters?");
        int numSpecialChars = newInput.getUserInt();
        System.out.println("How many numbers?");
        int numNumbers = newInput.getUserInt();

        String finalPassword = newPassword.genPassword(numMaxLength,numSpecialChars,numNumbers);
        System.out.printf("%s", finalPassword);

    }

}
