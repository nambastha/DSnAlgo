package com.algo.code.arrays;

public class ArrayRotation {

    public static void main(String args[]){
        int arr[] = {2,3,4,7,9,10};
        // op : 4,7,9,10,2,3
        int size = arr.length ;
        int temp ;
        int noOfRotation = 2;

        for (int i=0;i<noOfRotation;i++){
            temp=arr[0];
            for (int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[size-1]=temp;
        }
        for (int a:arr){
            System.out.println(a);
        }
    }
}
