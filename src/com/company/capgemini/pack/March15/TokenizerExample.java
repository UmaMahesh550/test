package com.company.capgemini.pack.March15;

import java.util.StringTokenizer;

public class TokenizerExample {
    static void StringTokenMethod(){
        StringTokenizer st = new StringTokenizer("Hello everyone I am a Java developer"," ");
        while (st.hasMoreElements())
        {
            System.out.println("String ="+st.nextToken());
        }
    }

    public static void main(String[] args) {
        StringTokenMethod();
    }
}
