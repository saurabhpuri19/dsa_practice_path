package org.practice;

import java.util.HashSet;

public class DuplicateNumbers{
    static void main() {

        //int[] num = {1,2,3,4,5,6};
        int[] num = {1,2,3,4,5,6,1};
        boolean result = duplicateNumbers(num);
        System.out.println("result :::::::: " +result);
    }

    public static boolean duplicateNumbers(int[] num){

        HashSet<Integer> unquieNumber =  new HashSet();
        for (int i = 0; i < num.length; i++) {
            if (unquieNumber.contains(num[i])){
                return true;
            }
            unquieNumber.add(num[i]);
        }
        return false;
    }

}