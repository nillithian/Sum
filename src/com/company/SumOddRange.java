package com.company;

public class SumOddRange {


    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else return number % 2 != 0;

    }


    public static int sumOdd(int start, int end) {
        int sum=0;
        for (int i = start ;i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
                if (start == end){
                    System.out.println("the sum is = " + sum);
                    break;
                }
//                System.out.println("the sum is = " + sum);



            }


        }
        return -1;
    }
}
