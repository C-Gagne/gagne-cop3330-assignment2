/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex25.Base;

import org.example.ex24.Base.UserInput;

public class App {
    public static void main(String[] args) {
        UserInput getPassword = new UserInput();
        CheckPasswordStrength checkPassword = new CheckPasswordStrength();
        OutputString outputString = new OutputString();

        String password = getPassword.getUserInput();
        int passwordStrength = checkPassword.passwordValidator(password);

        String finalString = outputString.genOutputString(passwordStrength);
        System.out.println(finalString);

    }
}