package com.company;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        if ((number <= 0) || (number == 1)) {
            return -1;
        }


        int Divisor = 0;
//        int i = number;
        int PrimeDivisor = 0;

        for (int i = 1; i <= number ; i++) {
            if (number % i == 0) {
                Divisor = i;

                for (int j = 2; j <= Divisor; j++) {
                    if (Divisor % j == 0) {
                        PrimeDivisor = Divisor;

                        return PrimeDivisor;
                    }
//                    else PrimeDivisor = Divisor;
                }
            }

//        for (int j = PrimeDivisor; j <= PrimeDivisor; j++ ){
//            if (PrimeDivisor % j == 0){
//                return -1;
//            } else PrimeDivisor = j;

        }
        return PrimeDivisor;
    }


}