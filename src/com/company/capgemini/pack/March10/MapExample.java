package com.company.capgemini.pack.March10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
        static void MapMethod(){
            Map<Integer, String> map = new HashMap<Integer, String>();
            map.put(31,"Teju");
            map.put(24,"Summu");
            map.put(1,"Venky");
            map.put(5,"Rithu");
            System.out.println("===================By Using Entry Set ==================");
            Set<Map.Entry<Integer,String>> entrySet =  map.entrySet();
            for(Map.Entry<Integer,String> entry : entrySet){
                System.out.println(entry.getKey()+"   "+entry.getValue());
            }
            System.out.println("===================By Using Key Set ==================");
            Set<Integer> keySet = map.keySet();
            for(Integer key : keySet){
                System.out.println(key+"   "+map.get(key));
            }

            System.out.println("===================By Using Iterator ==================");
            Iterator<Map.Entry<Integer,String>> itr =  entrySet.iterator();
            while(itr.hasNext()){
                Map.Entry<Integer,String> entry =  itr.next();
                System.out.println(entry.getKey()+"   "+entry.getValue());
            }

            System.out.println("===============By using Keyset Iterator===============");
            Iterator<Integer> itrInt= keySet.iterator();
            while(itrInt.hasNext()){
                Integer key =  itrInt.next();
                System.out.println(key+"   "+map.get(key));
            }
            System.out.println("================By using for each===============");
            map.forEach((k,v)-> System.out.println(k +" "+v));
        }
        public static void main(String[] args) {
            MapMethod();
        }

    }
