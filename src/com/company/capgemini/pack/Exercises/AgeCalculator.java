package com.company.capgemini.pack.Exercises;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {
    static void AgeCalculate()
    {
        LocalDate mdat=LocalDate.of(2000,5,16);
        LocalDate ldat=LocalDate.of(2021,5,16);
        LocalDate dat= LocalDate.now();

        int yr=dat.compareTo(mdat);
        long days= ChronoUnit.DAYS.between(ldat,dat);
        long months=ChronoUnit.MONTHS.between(ldat,dat);

//        System.out.println(yr);
//        System.out.println(days);
//        System.out.println(months);
        System.out.println("Age : "+yr+"years "+months+"Months "+days+"days");
    }
    public static void main(String[] args) {
        AgeCalculate();
    }
}
