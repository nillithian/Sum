package com.company;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int divisor = 0;
        int sum =0;

        for (int i = 1 ; i < number ; i++){
            if (number % i == 0){
                System.out.println("this is the value of i " + i);
                sum += i;
//                System.out.println(" this is the sum " + sum);
                }

            if (sum == number){
//                System.out.println("The SUM is " + sum + " and the NUMBER is "+number+". They are equal");
                return true;
            }
        } return false;
    }


}
