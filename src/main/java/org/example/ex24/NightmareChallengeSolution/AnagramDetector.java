/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex24.NightmareChallengeSolution;

public class AnagramDetector
{
    public boolean isAnagram(String first, String second)
    {
        // I know this is the absolute worse way to do this, but I was messing around with if statements.
        // It was also amusing... and very technically satisfied the challenge requirements.

        // Sorting the strings and then saying if (first.charAt(i) == second.charAt(i)) would be a much better solution.

        short spaceCount1, aCount1, bCount1, cCount1, dCount1, eCount1, fCount1, gCount1, hCount1, iCount1, jCount1, kCount1, lCount1, mCount1;
        short nCount1, oCount1, pCount1, qCount1, rCount1, sCount1, tCount1, uCount1, vCount1, wCount1, xCount1, yCount1, zCount1;

        short spaceCount2, aCount2, bCount2, cCount2, dCount2, eCount2, fCount2, gCount2, hCount2, iCount2, jCount2, kCount2, lCount2, mCount2;
        short nCount2, oCount2, pCount2, qCount2, rCount2, sCount2, tCount2, uCount2, vCount2, wCount2, xCount2, yCount2, zCount2;

        aCount1 = bCount1 = cCount1 = dCount1 = eCount1 = fCount1 = gCount1 = hCount1 = iCount1 = jCount1 = kCount1 = lCount1 = mCount1 = 0;
        spaceCount1 = nCount1 = oCount1 = pCount1 = qCount1 = rCount1 = sCount1 = tCount1 = uCount1 = vCount1 = wCount1 = xCount1 = yCount1 = zCount1 = 0;

        aCount2 = bCount2 = cCount2 = dCount2 = eCount2 = fCount2 = gCount2 = hCount2 = iCount2 = jCount2 = kCount2 = lCount2 = mCount2 = 0;
        spaceCount2 = nCount2 = oCount2 = pCount2 = qCount2 = rCount2 = sCount2 = tCount2 = uCount2 = vCount2 = wCount2 = xCount2 = yCount2 = zCount2 = 0;


        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                char c = Character.toLowerCase(first.charAt(i));
                if (c == 'a') {
                    aCount1++;
                }
                else if (c == 'b') {
                    bCount1++;
                }
                else if (c == 'c') {
                    cCount1++;
                }
                else if (c == 'd') {
                    dCount1++;
                }
                else if (c == 'e') {
                    eCount1++;
                }
                else if (c == 'f') {
                    fCount1++;
                }
                else if (c == 'g') {
                    gCount1++;
                }
                else if (c == 'h') {
                    hCount1++;
                }
                else if (c == 'i') {
                    iCount1++;
                }
                else if (c == 'j') {
                    jCount1++;
                }
                else if (c == 'k') {
                    kCount1++;
                }
                else if (c == 'l') {
                    lCount1++;
                }
                else if (c == 'm') {
                    mCount1++;
                }
                else if (c == 'n') {
                    nCount1++;
                }
                else if (c == 'o') {
                    oCount1++;
                }
                else if (c == 'p') {
                    pCount1++;
                }
                else if (c == 'q') {
                    qCount1++;
                }
                else if (c == 'r') {
                    rCount1++;
                }
                else if (c == 's') {
                    sCount1++;
                }
                else if (c == 't') {
                    tCount1++;
                }
                else if (c == 'u') {
                    uCount1++;
                }
                else if (c == 'v') {
                    vCount1++;
                }
                else if (c == 'w') {
                    wCount1++;
                }
                else if (c == 'x') {
                    xCount1++;
                }
                else if (c == 'y') {
                    yCount1++;
                }
                else if (c == 'z') {
                    zCount1++;
                }
                else if (c == ' ') {
                    spaceCount1++;
                } else {
                    throw new IllegalArgumentException(first);
                }
            }


            for (int i = 0; i < first.length(); i++) {
                char b = Character.toLowerCase(second.charAt(i));
                if (b == 'a') {
                    aCount2++;
                }
                else if (b == 'b') {
                    bCount2++;
                }
                else if (b == 'c') {
                    cCount2++;
                }
                else if (b == 'd') {
                    dCount2++;
                }
                else if (b == 'e') {
                    eCount2++;
                }
                else if (b == 'f') {
                    fCount2++;
                }
                else if (b == 'g') {
                    gCount2++;
                }
                else if (b == 'h') {
                    hCount2++;
                }
                else if (b == 'i') {
                    iCount2++;
                }
                else if (b == 'j') {
                    jCount2++;
                }
                else if (b == 'k') {
                    kCount2++;
                }
                else if (b == 'l') {
                    lCount2++;
                }
                else if (b == 'm') {
                    mCount2++;
                }
                else if (b == 'n') {
                    nCount2++;
                }
                else if (b == 'o') {
                    oCount2++;
                }
                else if (b == 'p') {
                    pCount2++;
                }
                else if (b == 'q') {
                    qCount2++;
                }
                else if (b == 'r') {
                    rCount2++;
                }
                else if (b == 's') {
                    sCount2++;
                }
                else if (b == 't') {
                    tCount2++;
                }
                else if (b == 'u') {
                    uCount2++;
                }
                else if (b == 'v') {
                    vCount2++;
                }
                else if (b == 'w') {
                    wCount2++;
                }
                else if (b == 'x') {
                    xCount2++;
                }
                else if (b == 'y') {
                    yCount2++;
                }
                else if (b == 'z') {
                    zCount2++;
                }
                else if (b == ' ') {
                    spaceCount2++;
                } else {
                    throw new IllegalArgumentException(second);
                }
            }
            if ( (aCount1 == aCount2) && (bCount1 == bCount2) && (cCount1 == cCount2) && (dCount1 == dCount2) && (eCount1 == eCount2) && (fCount1 == fCount2) && (gCount1 == gCount2) && (hCount1 == hCount2) && (iCount1 == iCount2) && (jCount1 == jCount2) && (kCount1 == kCount2) && (lCount1 == lCount2) && (mCount1 == mCount2) && (nCount1 == nCount2) && (oCount1 == oCount2) && (pCount1 == pCount2) && (qCount1 == qCount2) && (rCount1 == rCount2) && (sCount1 == sCount2) && (tCount1 == tCount2) && (uCount1 == uCount2) && (vCount1 == vCount2) && (wCount1 == wCount2) && (xCount1 == xCount2) && (yCount1 == yCount2) && (zCount1 == zCount2) && (spaceCount1 == spaceCount2)) {
                return true;
            }
            else return false;
        }
        return false;
    }
}
