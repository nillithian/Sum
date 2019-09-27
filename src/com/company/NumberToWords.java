package com.company;

public class NumberToWords {
    /**
     * 1. Extract the last digit of the given number using the remainder operator.
     * 2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
     * <p>
     * Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
     * 3. Remove the last digit from the number.
     * 4. Repeat Steps 2 through 4 until the number is 0.
     *
     * @return
     */

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.print("Invalid Value");
        } else if (number == 0){
            System.out.println("Zero ");
        }
        int reverse = reverse(number);

        int ReversedMinusZeroes = reverse;


        int zeroes = getDigitCount(number) - getDigitCount(reverse);

        while (ReversedMinusZeroes > 0) {
            int LastDigit = ReversedMinusZeroes % 10;
            switch (LastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Other");

            }
            ReversedMinusZeroes = ReversedMinusZeroes / 10;


        }
        if (zeroes > 0) {
            for (int j=0;j<zeroes;j++){
                System.out.print("Zero ");
            }
        }


    }


    /**
     * // The method reverse should have one int parameter and return the reversed number (int).
     * // For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
     *
     * @return
     */
    public static int reverse(int reverseNumber) {


        int reverse = 0;
        while (reverseNumber != 0) {
            int lastDigit = reverseNumber % 10;
            reverse *= 10;
            reverse += lastDigit;
            reverseNumber = reverseNumber / 10;
        }
        return reverse;
    }


    /**
     * // The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
     * //For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
     */
    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0)
            return 1;

        int count = 0;
        int i = number;

        while (i > 0) {
            i /= 10;
            count++;
        }
//        String.valueOf(number).length();
//        System.out.println(String.valueOf(number).length());

        return count;
    }
}






