package com.company;

/**
 * The patterns above consist of a number of rows and columns (where number is the number of rows to print).
 * For each row or column, stars are printed based on four conditions (Read them carefully):
 * <p>
 * In the first or last row
 * <p>
 * In the first or last column
 * <p>
 * When the row number equals the column number
 * <p>
 * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
 * <p>
 * <p>
 * HINT: Use a nested loop (a loop inside of a loop).
 * <p>
 * i = rowCount
 * j = column
 */

public class DiagonalStar {

    public static void printSquareStar ( int number ) {
        if ( number < 5 ) {
            System.out.print ( "Invalid Value" );
        }
else
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number; j++) {
                if ( ( j == number - i + 1 ) || ( j == 1 ) || ( i == 1 ) || ( j == i ) || ( j == number ) || ( i == number ) ) {

                    System.out.print ( "*" );
                } else {
                    System.out.print ( " " );
                }
            }
            System.out.println ();
        }
    }

}





