/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex36.Base;

import java.util.ArrayList;
import java.util.List;

public class MathCalculations
{
    public Double average(List arrayNumbers)
    {
        double total = 0.0;
        for (int i = 0; i< arrayNumbers.size(); i++)
        {
            double heldDouble = Double.parseDouble((String) arrayNumbers.get(i));
            total += heldDouble;
        }
        return (total / arrayNumbers.size());

    }
    public Double max(List arrayNumbers)
    {
        List<Double> convertedArray = new ArrayList<>();
        for (int i =0; i < arrayNumbers.size(); i++)
        {
            double transferValue = Double.parseDouble((String) arrayNumbers.get(i));
            convertedArray.add(transferValue);
        }

        double maximum = convertedArray.stream().max(Double::compare).get();

        return maximum;
    }
    public Double min(List arrayNumbers)
    {
        List<Double> convertedArray = new ArrayList<>();
        for (int i =0; i < arrayNumbers.size(); i++)
        {
            double transferValue = Double.parseDouble((String) arrayNumbers.get(i));
            convertedArray.add(transferValue);
        }

        double minimum = convertedArray.stream().min(Double::compare).get();

        return minimum;
    }

    public Double std(List arrayNumbers, Double average)
    {
        List<Double> convertedArray = new ArrayList<>();
        List<Double> numberMinusAvgSqrArray = new ArrayList<>();
        double totalNumMinusAvgSqr = 0;

        for (int i =0; i < arrayNumbers.size(); i++)
        {
            double transferValue = Double.parseDouble((String) arrayNumbers.get(i));
            convertedArray.add(transferValue);
        }

        for (int i = 0; i < arrayNumbers.size(); i++)
        {
            double valueFromList = convertedArray.get(i);
            double vFromListMinAvg = valueFromList - average;

            double numMinusAvgSqr = Math.pow(vFromListMinAvg, 2);

            numberMinusAvgSqrArray.add(numMinusAvgSqr);
        }

        for ( int i = 0; i < numberMinusAvgSqrArray.size(); i++)
        {
            totalNumMinusAvgSqr += numberMinusAvgSqrArray.get(i);
        }

        double avgOfTotalNumMinusAvgSqr = totalNumMinusAvgSqr/arrayNumbers.size();

        return (Math.sqrt(avgOfTotalNumMinusAvgSqr));
    }
}
