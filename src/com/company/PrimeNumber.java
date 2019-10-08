package com.company;

public class PrimeNumber {

    public static boolean isPrime ( int n ) {
        if ( n == 1 ) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) / 2; i++) {
//            System.out.println (i);
            if ( n % i == 0 ) {
                return false;
            }
        }
        return true;
    }



}
