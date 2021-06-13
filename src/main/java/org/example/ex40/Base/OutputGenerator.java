/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex40.Base;

import java.util.List;
import java.util.Map;

public class OutputGenerator
{
    public String genOutput(List<Map<String,String>> matchingEmployeerecords)
    {
        StringBuilder buildingOutputString = new StringBuilder();

        buildingOutputString.append(String.format("%-36s%-30s%-30s\n", "Name", "Position", "Separation Date"));
        buildingOutputString.append(String.format("%-36s\n", "------------------------------------------------------------------------------------"));

        for (int i = 0; i< matchingEmployeerecords.size(); i++)
        {
            String fullName = (matchingEmployeerecords.get(i).get("First Name")) + " " + (matchingEmployeerecords.get(i).get("Last Name"));
            buildingOutputString.append(String.format("%-30s    |  ", fullName ));
            buildingOutputString.append(String.format("%-22s    |   ", matchingEmployeerecords.get(i).get("Position")));
            buildingOutputString.append(String.format("%-22s    \n", matchingEmployeerecords.get(i).get("Separation Date")));
        }


        String outputString = buildingOutputString.toString();
        return outputString;
    }
}
