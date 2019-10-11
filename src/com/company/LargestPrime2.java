package com.company;

public class LargestPrime2 {

    public static int getLargestPrime(int number) {

        int divisor = 0;

        if (number<=1) {
            return -1;
        }
        for (int i = number; i >= 2; i--) {
            if (number % i == 0) {
                divisor = i;
                boolean isPrime = true;

                for (int j = 2; j <= divisor / 2; j++) {
                    if (divisor % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    return divisor;
                }
            }
        }

        return -1;
    }
}
