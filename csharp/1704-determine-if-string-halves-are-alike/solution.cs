using System;
using System.Collections.Generic;

public class Solution 
{
    public bool HalvesAreAlike(string s) 
    {
        int middleLength = s.Length / 2;

        string firstHalf = s.Substring(0, middleLength);
        string secondHalf = s.Substring(middleLength);

        return CountVowels(firstHalf) == CountVowels(secondHalf);
    }
 
    public int CountVowels(string str)
    {
        HashSet<char> vowels = new HashSet<char> { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        return str.Count(ch => vowels.Contains(ch));
    }
}
