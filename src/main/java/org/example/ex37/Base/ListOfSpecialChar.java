/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex37.Base;

import java.util.ArrayList;
import java.util.List;

public class ListOfSpecialChar
{
    public Character getSpecialChar(int randomNum)
    {
        List<Character> arrayOfSpecialChar = new ArrayList<>();
        arrayOfSpecialChar.add('!');
        arrayOfSpecialChar.add('@');
        arrayOfSpecialChar.add('#');
        arrayOfSpecialChar.add('$');
        arrayOfSpecialChar.add('%');
        arrayOfSpecialChar.add('^');
        arrayOfSpecialChar.add('&');
        arrayOfSpecialChar.add('*');
        arrayOfSpecialChar.add('(');
        arrayOfSpecialChar.add(')');

        return arrayOfSpecialChar.get(randomNum);
    }

}
