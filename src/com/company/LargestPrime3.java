package com.company;

public class LargestPrime3 {

    public static int getLargestPrime(int number) {
        if(number >= 2) {
            for(int i=2; i<=number; i++) {
                while(number%i == 0) {
                    number = number / i;
                    if(number == 1) {
                        return i;
                    }
                }

            }
        }
        return -1;
    }
}
