/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */


package org.example.ex40.Base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchEmployeeRecords
{
    public List searchPrefixEmployeeRecords(List<Map<String,String>> employeeRecords, String prefix)
    {
        List<Map<String, String>> matchingEmployees = new ArrayList<Map<String, String>>();


        for (int i = 0; i < employeeRecords.size(); i++)
        {
            if (employeeRecords.get(i).get("First Name").contains(prefix) || employeeRecords.get(i).get("Last Name").contains(prefix))
            {
                int finalI = i;
                matchingEmployees.add(new HashMap<String, String>() {{
                    put("First Name", employeeRecords.get(finalI).get("First Name"));
                    put("Last Name", employeeRecords.get(finalI).get("Last Name"));
                    put("Position", employeeRecords.get(finalI).get("Position"));
                    put("Separation Date", employeeRecords.get(finalI).get("Separation Date"));
                }});
            }
        }

        return matchingEmployees;
    }
}
