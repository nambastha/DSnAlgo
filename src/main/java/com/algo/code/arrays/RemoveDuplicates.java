package com.algo.code.arrays;


/*
For the given array {1,3,5,6,6,7,8,8,8,9}
remove the duplicates
op: {1,3,5,6,7,8,9}
*/


public class RemoveDuplicates {
    public static void main(String args[]) {
        int A[] = {1, 3, 5, 6, 6, 7, 8, 8, 8, 9};

        int i=0;
        for (int j=1;j<A.length;j++){
            if (A[i] != A[j]){
                i++ ;
                A[i]=A[j];
            }
        }
        i++;
        System.out.println("value of i: "+i);
        for (int k=0;k<A.length;k++){
            System.out.println("Output: "+A[k]);
        }

    }
}
