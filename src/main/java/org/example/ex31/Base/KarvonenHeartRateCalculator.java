/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex31.Base;

public class KarvonenHeartRateCalculator
{
    public void getHeartRate(double age, double restingHR)
    {
            double targetHR;
            for (double intensity = 0.55; intensity<1.0; intensity+=0.05)
            {
                if (intensity ==0.55)
                {
                    System.out.println("Intensity  |   Rate");
                }
                targetHR = (((220 - age) - restingHR) * intensity) + restingHR;
                double percentIntensity = intensity*100;
                System.out.printf("%.0f         |   %.0f", percentIntensity, targetHR);
                System.out.println();
            }
    }
}
