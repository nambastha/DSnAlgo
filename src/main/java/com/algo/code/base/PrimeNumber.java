package com.algo.code.base;

// Using Sieve of Eratosthenes is the most efficient way of generating prime numbers upto a given number N.
/*
Create a list of consecutive integers from 2 to n: (2, 3, 4, ..., n).
Initially, let p equal 2, the first prime number.
Starting from p2, count up in increments of p and mark each of these numbers greater than or equal to p2 itself in the list. These numbers will be p(p+1), p(p+2), p(p+3), etc..
Find the first number greater than p in the list that is not marked. If there was no such number, stop. Otherwise, let p now equal this number (which is the next prime), and repeat from step 3.
*/

import java.util.ArrayList;


public class PrimeNumber {
   /* static int countPrimesUpperBound(int max) {
        return max > 1 ? (int)(1.25506 * max / Math.log((double)max)) : 0;  //Formula for upper bound of number of primes less than or equal to limit
    }

    static ArrayList<Integer> generatePrimes(int limit) {
        final int numPrimes = countPrimesUpperBound(limit);
        System.out.println("numPrimes ==> "+numPrimes);
        ArrayList<Integer> primes = new ArrayList<Integer>(numPrimes);
        boolean [] isComposite    = new boolean [limit];   // all false
        final int sqrtLimit       = (int)Math.sqrt(limit); // floor
        for (int i = 2; i <= sqrtLimit; i++) {
            if (!isComposite [i]) {
                primes.add(i);
                for (int j = i*i; j < limit; j += i) // `j+=i` can overflow
                    isComposite [j] = true;
            }
        }
        for (int i = sqrtLimit + 1; i < limit; i++)
            if (!isComposite [i])
                primes.add(i);
        return primes;
    }*/

    public static ArrayList<Integer> findPrimes(int limit) {

        ArrayList<Integer> list = new ArrayList<>();

        boolean [] isComposite = new boolean [limit + 1]; // limit + 1 because we won't use '0'th index of the array
        System.out.println("isComposite ==> "+isComposite.length);
        System.out.println("==================");
        isComposite[1] = true;

        // Mark all composite numbers
        for (int i = 2; i <= limit; i++) {
            if (!isComposite[i]) {
                // 'i' is a prime number
                list.add(i);
                int multiple = 2;
                while (i * multiple <= limit) {
                    isComposite [i * multiple] = true;
                    multiple++;
                }
            }
        }

        return list;
    }

    public static void main (String args[]){

        ArrayList<Integer> result = new ArrayList<>();
/*        result = PrimeNumber.generatePrimes(20);
        for (int primeNum:result){
            System.out.println("Prime number ==> "+ primeNum);
        }*/

        result = PrimeNumber.findPrimes(20);
        for (int primeNum:result){
            System.out.println("Prime number 2nd approach ==> "+ primeNum);
        }

    }
}
