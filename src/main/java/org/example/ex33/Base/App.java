/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex33.Base;


public class App {
    public static void main(String[] args)
    {
        UserInput newInput = new UserInput();
        OutputGenerator outputGenerator = new OutputGenerator();
        RandomNumberGenerator getRandomNum = new RandomNumberGenerator();

        int randomNum = getRandomNum.genRandomNumber();
        System.out.println("What is your question?");
        String userQuestion = newInput.getUserInput();
        String finalString = outputGenerator.generateOutput(randomNum);

        System.out.println(finalString);

    }
}