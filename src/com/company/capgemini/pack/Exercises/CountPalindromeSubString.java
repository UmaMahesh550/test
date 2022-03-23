package com.company.capgemini.pack.Exercises;

import java.util.Scanner;

public class CountPalindromeSubString {
    public static int palindromeSubstrings(String s)
    {
        int count=s.length();
        for(int i = 0; i < s.length(); i++)
        {
            for(int j = i+2; j <= s.length(); j++)
            {
                count += palindrome(s.substring(i, j));
            }
        }
        return count;
    }
    public static int palindrome(String ss)
    {
        for(int i = 0; i < ss.length() / 2; i++)
        {
            if(ss.charAt(i) != ss.charAt(ss.length() - 1 - i))
            {
                System.out.println(ss);
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int res=palindromeSubstrings(str);
        System.out.println(res);

    }
}
