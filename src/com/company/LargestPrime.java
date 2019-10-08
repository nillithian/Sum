package com.company;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        int PrimeDivider = 0;
//        int i = 3;

        if ((number < 0) || (number == 1)) {
            return -1;
        }
        for (int i = 2; i<= number; i++){
            if (number % i == 0) {
                System.out.println("i is not prime");
                return -1;
            } else
                PrimeDivider = i;
//                return i;
        }


        return PrimeDivider;
    }
}