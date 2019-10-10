package com.company;

public class LargestPrime2 {

    public static int getLargestPrime(int number) {

        int Divisor = 0;
//        int i = number;
        int PrimeDivisor = 0;
        boolean isPrime = false;

        if ((number <0 ) || (number == 1)) {
            return -1;
        }

        for (int i = number; i>1 ; i--){
            if (number % i == 0){
                Divisor = i;
                for (int j = Divisor; j <= number / 2;j++){
                    if (Divisor % j == 0) {
                        PrimeDivisor = Divisor;

                        return PrimeDivisor;
                    }
//                    else PrimeDivisor = Divisor;
//                    break;
                }
            }
        }
        return PrimeDivisor;

    }
}
