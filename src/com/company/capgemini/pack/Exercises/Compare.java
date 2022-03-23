package com.company.capgemini.pack.Exercises;

import java.util.Comparator;

abstract class Compare implements Comparator<Compare> {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Compare() {
        this.name = name;
    }
}
class NameComparator implements Comparator<Compare> {
    public int compare(Compare o1, Compare o2) {
            return o1.name.compareTo(o2.name);
        }
}
