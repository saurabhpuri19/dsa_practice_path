package org.practice;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static void main(String[] args){
    //int[] nums = {1,2,1,3,4};
    int[] nums = {1,2,3,4};
    boolean result = conatainsDuplicate(nums);
    System.out.println("result ::::: " +result);
    }

    public static boolean conatainsDuplicate(int[] nums) {
        Set<Integer> unquie = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(unquie.contains(nums[i])){
                return true;
            }
            unquie.add(nums[i]);
        }
        return false;
    }

}
