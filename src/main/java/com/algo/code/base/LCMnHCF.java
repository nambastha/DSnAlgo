package com.algo.code.base;
/*

LCM and HCF of given two numbers a and b
a*b = lcm(a,b)*hcf(a,b)

*/

public class LCMnHCF {

    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args)
    {
        int a = 98, b = 56;
        int gcd = gcd(a,b);
        System.out.println("GCD of " + a +" and " + b + " is " + gcd);


        int lcm = (a*b)/gcd;
        System.out.println("LCM of "+ a +" and "+ b + " is "+ lcm);
    }
}
