package com.company.capgemini.pack.March14;

public class ArrayExample {
    static void ArrayMethod(int[] a)
    {
        for(int i:a){
            System.out.println(i);
        }
    }

    static void multidim() {
        int[][] a = {{3, 2, 7},
                {4, 5},
                {6, 7, 2, 1}
        };
        System.out.println("a.length = " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i].length = " + a[i].length);
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]=34;
        a[1]=54;
        a[2]=21;
        a[3]=12;
        a[4]=76;
        ArrayMethod(a);
        multidim();
    }
}
