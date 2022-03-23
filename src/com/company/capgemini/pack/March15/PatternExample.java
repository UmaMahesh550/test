package com.company.capgemini.pack.March15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        //1st way
        Pattern p = Pattern.compile(".s");//. represents single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        //2nd way
        boolean b2=Pattern.compile(".s").matcher("as").matches();

        //3rd way
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b+"\n"+b2+"\n"+b3);
        System.out.println("? quantifier ...."); //should have only one character defined in regex.
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aaaammmnnnn"));//false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aamn"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)

        System.out.println("+ quantifier ....");//should have one or many characters defined in regex and not out characters.
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "mmaammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println("* quantifier ....");//characters defined in regex may come zero or more times.
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
        System.out.println(Pattern.matches("[amn]*", ""));//true (a or m or n may come zero or more times)
        System.out.println(Pattern.matches("[amn]*", "annz"));//true (a or m or n may come zero or more times)
        System.out.println(Pattern.matches("[amn]*", "annmmmmmmm"));//true (a or m or n may come zero or more times)

        System.out.println("===================length pattern===============");//any class of characters defined can be with length defined.
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2UK2"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)
    }
}
