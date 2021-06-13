/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex36.Base;

public class GenerateOutput {
    public String genOutputString(double min, double max, double average, double std)
    {
        String stringOutputAvg = "The average is: " + average;
        String stringOutputMin = "The minimum is: " + min;
        String stringOutputMax = "The maximum is: " + max;
        String stringOutputSTD = "The standard deviation is: " + std;

        return (stringOutputAvg + " \n" + stringOutputMin + " \n" + stringOutputMax + " \n" + stringOutputSTD);
    }
}
