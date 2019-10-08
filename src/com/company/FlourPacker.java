package com.company;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        System.out.println("bigCount = " + bigCount + ", smallCount = " + smallCount + ", goal = " + goal);
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            System.out.println("One of the numbers is smaller than 0");
            return false;
        }
//Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
// The method should return true if it is possible to make a package with goal kilos of flour.


// If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
// For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided.
// However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal,
// and it's okay if there are additional bags left over.
//
//If any of the parameters are negative, return false.

// bigCount * 5 = goal.

        //reminder ne Arata cate pachete de 5kg intra in GOAL : Goal / 5 (nr de kg in 1 pachet) == numar de pachete de 5kg necasare pt goal.

        int reminder = goal / 5;
        int BigFlour = bigCount * 5;
        System.out.println("How many 5KG packs does the Goal ( " + goal + " ) take? the number is :  " + reminder);

        //Cate pachete de 5 KG avem la dispozitie == numar dat de Big count.

        //Verifica daca avem mai multe pachete de 5kg la dispozitie fata de numarul necesar din goal.

        if ((bigCount == 0) && (smallCount >= goal)) {
            return true;
        } else if ((bigCount == 0) && (smallCount < goal)) {
            return false;
        } else if (reminder * 5 > bigCount * 5) {
            if ((bigCount * 5 >= goal) || (bigCount * 5 + smallCount >= goal)) {
                return true;
            }
        } else if ((reminder * 5 >= goal) || (reminder * 5 + smallCount >= goal)) {
            return true;
        }
        return false;
    }
}


