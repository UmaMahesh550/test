package com.company.capgemini.pack.Exercises;

import java.util.*;



public class CatalogSortedListSearch {

    static String catalogListSearcher(Set<String> s,String inp)
    {

        if(inp.equals("[]"))
        {
            System.out.println("The Catalog List is Empty");
            System.exit(0);
        }
        if(inp.equals("null")&s!=null)
            catalogListSorter(s);

        else
        {
            for(String su:s)
            {
                if(su.equalsIgnoreCase(inp))
                {
                    return ("Found :"+inp);
                }
            }
        }
        return "Not Found";
    }

    static List<String> catalogListSorter(Set<String> s)
    {
        if(s==null)
        {
            System.out.println("Catalog List Contains empty or null value or blank space");
            System.exit(0);
        }
        List<String> li = new ArrayList<String>();
        li.addAll(s);
        Collections.sort(li);
        return li;
    }

    public static void main(String[] args) {

        String input;
        Scanner sc = new Scanner(System.in);
        Set<String> ar = new HashSet<>();
//        ar.add("Nike");
//        ar.add("Puma");
//        ar.add("Adidas");
//        ar.add("Reebok");
//        ar.add("UnderArmor");
//        ar.add("NBalance");
//        ar.add("SuperDry");
        while(sc.hasNext())
        {
            String a = sc.next();
            if(a.equalsIgnoreCase("stop"))
                break;
            ar.add(a);
        }

        System.out.println("Enter Key Word to Search");
        input=sc.next();
        if(input.equals("null"))
        {
            List<String> si=catalogListSorter(ar);
            for(String s:si)
                System.out.println(s);
        }
        else
        {
            String res=catalogListSearcher(ar,input);
            System.out.println(res);
        }
    }
}
