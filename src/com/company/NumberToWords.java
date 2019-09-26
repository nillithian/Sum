package com.company;

public class NumberToWords {
/**
    1. Extract the last digit of the given number using the remainder operator.
    2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.

    Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
3. Remove the last digit from the number.
4. Repeat Steps 2 through 4 until the number is 0.
 */

//    public static boolean numberToWords(int number) {
//
//
//    }


/**
// The method reverse should have one int parameter and return the reversed number (int).
// For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
*/
//    public static boolean Reverse (int reverse) {
//
//    }

/**
// The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
//For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
 */
    public static int getDigitCount (int number){
        int digits = 0;

        if (number < 0) {
            return -1;
        } if (number == 0)
            return 1;

            int count = 0;
            int i = number;

            while (i > 0) {
                i /= 10;
                count ++;
            }

            return count;
    }
}





