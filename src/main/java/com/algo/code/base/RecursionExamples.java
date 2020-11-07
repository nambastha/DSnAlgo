package com.algo.code.base;

public class RecursionExamples {

    public static void print1ToN(int n){
        if (n==0){
            return;
        }
        //System.out.println(n +"    ");   will print in reverse
        print1ToN(n-1);
        System.out.println(n +"    ");
    }

    public static String checkPallindrome(String str, int start, int end){

        if (start>=end){
            return "yes";
        }

        if (str.charAt(start)==str.charAt(end)){
            return checkPallindrome(str,start+1,end-1);
        }
        return "no";
    }

    public static void main(String args[]){
        int n =5;
        //print1ToN(n);
        System.out.println(checkPallindrome("abcdcbba",0,"abcdcba".length()-1));

    }
}
