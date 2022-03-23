package com.company.capgemini.pack.March15;

import java.util.*;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(10);
        list.add(null);
        list.add(50);
        Set<Integer> set=new LinkedHashSet<>(list);
        System.out.println(set);

    }
}
