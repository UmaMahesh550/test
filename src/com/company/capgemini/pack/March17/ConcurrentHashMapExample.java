package com.company.capgemini.pack.March17;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> hash=new ConcurrentHashMap<>();
        hash.put(505,"Hello");
        hash.put(202,"Sai");
        hash.put(303,"How r u ?");
//        Iterator itr = hash;
//        hash.putIfAbsent(202,"Ram");
        hash.putIfAbsent(404,"I'm fine.");
        hash.remove(202,"Sai");
        hash.replace(303,"How r u ?","I think u r fine.");
        System.out.println(hash);

        Set<Integer> set = hash.keySet();
        for(Integer i : set)
            System.out.println(i);

    }
}
