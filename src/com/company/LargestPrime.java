package com.company;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        if ((number <= 0) || (number == 1)) {
            return -1;
        }


        int Divisor = 0;

        int  PrimeDivisor = 0;

        for (int i = 2; i <= Math.sqrt(number) / 2; i++) {
            if (number % i == 0) {
                Divisor = i;
                System.out.println("Divisor here is " + Divisor);

                boolean isPrime = true;
                for (int j = 2; j < Divisor / 2; j++) {
                    if (Divisor % j == 0) {
                        isPrime = false;
                    } if (isPrime) {
                        return Divisor;
                    }
                }
            }


//            return -1;
        }
        System.out.println("ai ajuns aici");
        return Divisor;
    }
}