package com.company;

public class FlourPacker2 {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount >= 0 && smallCount >= 0 && goal >= 0){
            if((5*bigCount == goal && smallCount == 0) || (5*bigCount == 0 && smallCount >= goal))
                return true;
        } else {
            if((5*bigCount <= goal) && (5*bigCount + smallCount >= goal))
            return true;}
        return false;
    }
}