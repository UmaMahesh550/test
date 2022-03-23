package com.company.capgemini.pack.March17;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> lst = new CopyOnWriteArrayList<>();
        lst.add("Hello");
        lst.add("Sai");
        lst.add("How r u ?");
        System.out.println("List Contains :");
        Iterator<String> itr=lst.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
