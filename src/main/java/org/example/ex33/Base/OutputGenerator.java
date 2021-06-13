/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex33.Base;

import java.util.*;

public class OutputGenerator
{
    public String generateOutput(int randomNum)
    {
        List<String> eightBallOutputs = new ArrayList<>();
        eightBallOutputs.add("Yes.");
        eightBallOutputs.add("No.");
        eightBallOutputs.add("Ask again later.");
        eightBallOutputs.add("Maybe.");

        return eightBallOutputs.get(randomNum);
    }
}
