package com.algo.code.base;

public class Introduction {

    public static void main(String args[]){
        Introduction introduction = new Introduction();
        introduction.question5();
        System.out.println("question 6 ==>"+introduction.unknown(5)  + " complexity is n^2logn");
    }

    public void question5(){
        int n, rev;
        n = 13478 ;
        rev = 0;
        while (n > 0)
        {
            rev = rev*10 + n%10;
            n = n/10;
            System.out.println("rev is "+rev);
            System.out.println("n is "+n);
        }
    }

    int unknown(int n) {

        int i, j, k = 0;

        for (i  = n/2; i <= n; i++)

            for (j = 2; j <= n; j = j * 2)

                k = k + n/2;

        return k;

    }
}
