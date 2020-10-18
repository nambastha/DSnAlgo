package com.algo.code.base;

// to find number of digits in a given number N
// will follow 3 different approaches

public class NoOfDigits {

    public static void main(String args[]){
        int N = 57896;

        //approach 1 : iterate through each value. time complexity is O(n)
        int count = 0;
        while (N>0){
            count=count+1;
            N=N/10;
            System.out.println("loop "+count);
        }
        System.out.println("number of digits are "+count);

        //approach 2: mathematical formula
        System.out.println("***********************************************");
        N = 57896;
        count = (int)Math.floor(Math.log10(N)+1);
        System.out.println("using log to find the solution "+ Math.log10(N)+1 );
        System.out.println("using log to find the solution "+ count);

        //approacg 3: using String
        System.out.println("***********************************************");
        count = String.valueOf(N).length();
        System.out.println("using String and finding the length "+count);
    }

}
