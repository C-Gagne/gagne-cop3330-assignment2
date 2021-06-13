/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex32.Base;

public class App
{
    public static void main(String[] args)
    {
        UserInput newInput = new UserInput();
        InputValidator checkValid = new InputValidator();
        CheckEquals checkEquals = new CheckEquals();
        RandomNumber randomInt = new RandomNumber();
        OutputString outputString = new OutputString();

        boolean isValidDifficulty = false;
        boolean playGame = true;
        String playAgain = "";
        String difficulty = "";

        System.out.println("Let's play Guess the Number!\n");

        while (playGame) {
            while (!isValidDifficulty) {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                difficulty = newInput.getUserInput();
                isValidDifficulty = checkValid.validateDifficulty(difficulty);

                if (!isValidDifficulty) {
                    System.out.println("Sorry, that is not a valid input.");
                }
            }

            int intDifficulty = Integer.parseInt(difficulty);
            int numGuesses = 0;
            String guess = "";
            boolean isEqual = false;
            int randNum = randomInt.genRandomNumber(intDifficulty);
            System.out.print("I have my number. ");
            System.out.println("What is your guess?");

            while (!isEqual) {
                boolean isValidGuess = false;

                while (!isValidGuess) {
                    guess = newInput.getUserInput();
                    isValidGuess = checkValid.validateGuess(guess);

                    if (!isValidGuess) {
                        System.out.println("Sorry, that is not a valid input. Try again: ");
                        numGuesses++;
                    }
                }

                int intGuess = Integer.parseInt(guess);
                numGuesses++;
                isEqual = checkEquals.checkEquals(randNum, intGuess);
            }
            String finalString = outputString.genOutputString(numGuesses);
            System.out.println(finalString);

            boolean isValidYesNo = false;
            while(!isValidYesNo) {
                System.out.println("Did you want to play again (Y/N)?");
                playAgain = newInput.getUserInput();
                isValidYesNo = checkValid.validateYesOrNo(playAgain);
                if (!isValidYesNo) {
                    System.out.println("Sorry, that is not a valid input. Try again: ");
                }
            }
            if (playAgain.equalsIgnoreCase("Y"))
            {
                playGame = true;
            }
            else if (playAgain.equalsIgnoreCase("N"))
            {
                playGame = false;
            }
        }
    }
}
